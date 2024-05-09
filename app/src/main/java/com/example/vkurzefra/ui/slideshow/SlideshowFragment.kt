package com.example.vkurzefra.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.vkurzefra.R
import com.example.vkurzefra.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        webView = view.findViewById(R.id.webview)
        // Включаем JavaScript (если это необходимо)
        webView.settings.javaScriptEnabled = true

        // Загружаем URL
        webView.loadUrl("https://vkurse.online")

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}