package com.example.employeedirectory.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.employeedirectory.adapters.EmployeeAdapter
import com.example.employeedirectory.data.EmployeeData

class EmployeeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return RecyclerView(requireContext()).apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = EmployeeAdapter(EmployeeData.employees) { employee ->
                Toast.makeText(
                    requireContext(),
                    "${employee.name} - ${employee.designation}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
