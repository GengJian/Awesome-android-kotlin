package com.soul.awesome.uiwidgettest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.soul.awesome.uiwidgettest.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // A.通过控件绑定lambada表达式
        binding.button.setOnClickListener {
            Log.d("FirstFragment", "通过viewbinding响应OnClick方法")
            val inputText = binding.editText.toString()
            Toast.makeText(this.activity, inputText, Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        // B.通过接口实现
        binding.button.setOnClickListener(this)
        binding.changeImageButton.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /// 通过接口 统一处理onClick方法
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.button -> {
                Log.d("FirstFragment", "通过接口响应OnClick方法")
                val inputText = binding.editText.toString()
                Toast.makeText(this.activity, inputText, Toast.LENGTH_SHORT).show()
            }
            R.id.changeImageButton -> {
                Log.d("FirstFragment", "通过接口响应OnClick方法")
                binding.imageView.setImageResource(R.drawable.img_2)
            }
        }
    }
}