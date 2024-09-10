package com.andri.discovermagelang.ui.destination.regional

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.andri.discovermagelang.R
import com.andri.discovermagelang.data.model.SubDistrict
import com.andri.discovermagelang.databinding.FragmentRegionalBinding

class RegionalFragment : Fragment() {

    private var _binding: FragmentRegionalBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegionalBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListSubDistrict()
    }

    private fun setListSubDistrict() {
        val itemList = listOf(
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
            SubDistrict( "Lorem ipsum", R.drawable.img_holder),
        )

        val adapter = SubDistrictAdapter(itemList)
        binding.rvSubDistrict.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvSubDistrict.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}