package com.unit6.interviewproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        test()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }
    fun test() = runBlocking {
        Log.d("EXAMPLE","Hello from ${Thread.currentThread().name}")
        withContext(Dispatchers.Default) {
            Log.d("EXAMPLE","Hello from ${Thread.currentThread().name}")
        }
        Log.d("EXAMPLE","Welcome back to ${Thread.currentThread().name}")
    }
}
