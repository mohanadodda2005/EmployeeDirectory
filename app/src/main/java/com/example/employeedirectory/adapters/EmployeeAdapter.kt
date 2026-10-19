package com.example.employeedirectory.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.employeedirectory.databinding.ItemEmployeeBinding
import com.example.employeedirectory.models.Employee

class EmployeeAdapter(
    private val employees: List<Employee>,
    private val onItemClick: (Employee) -> Unit
) : RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    class EmployeeViewHolder(val binding: ItemEmployeeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val binding = ItemEmployeeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return EmployeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = employees[position]
        holder.binding.tvName.text = employee.name
        holder.binding.tvDesignation.text = employee.designation
        holder.binding.tvDepartment.text = employee.department
        holder.binding.root.setOnClickListener { onItemClick(employee) }
    }

    override fun getItemCount() = employees.size
}
