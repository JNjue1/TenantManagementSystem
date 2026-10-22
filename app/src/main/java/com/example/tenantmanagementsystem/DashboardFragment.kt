package com.example.tenantmanagementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
// Generated from fragment_dashboard.xml (View Binding)
import com.example.tenantmanagementsystem.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
        private var _binding: FragmentDashboardBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val tenantCount = TenantRepository.tenants.size
            val totalRent = TenantRepository.totalRent()

            binding.tenantCountTextView.text = "Tenants\n$tenantCount"
            binding.totalRentTextView.text = "Total rent\nKSh %,.0f".format(totalRent)
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
        }