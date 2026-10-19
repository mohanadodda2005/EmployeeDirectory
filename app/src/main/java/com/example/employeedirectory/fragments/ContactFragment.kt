package com.example.employeedirectory.fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return TextView(requireContext()).apply {
            text = "Contact\n\nEmail: hr@company.com\nPhone: +91 98765 43210"
            textSize = 20f
            gravity = Gravity.CENTER
        }
    }
}