package com.example.employeedirectory.fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.employeedirectory.data.EmployeeData

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val total = EmployeeData.employees.size
        val depts = EmployeeData.employees.map { it.department }.distinct().size
        return TextView(requireContext()).apply {
            text = "Dashboard\n\nTotal Employees: $total\nDepartments: $depts"
            textSize = 22f
            gravity = Gravity.CENTER
        }
    }
}
