package com.example.employeedirectory.fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.employeedirectory.data.EmployeeData

class DepartmentsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val list = EmployeeData.employees.groupBy { it.department }
            .map { "${it.key}: ${it.value.size} ${if (it.value.size == 1) "employee" else "employees"}" }
            .joinToString("\n")
        return TextView(requireContext()).apply {
            text = "Departments\n\n$list"
            textSize = 20f
            gravity = Gravity.CENTER
        }
    }
}