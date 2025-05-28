package ar.edu.ifts18.ciclodevidafragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class CicloVidaFragment : Fragment() {

    private val TAG = "FragmentCV"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "estoy en el onAttach")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "estoy en el onSaveInstanceState")
        outState.putString("mensaje", "Hola desde Saved instance")
    }


    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstance)
        Log.d(TAG, "estoy en el onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView")

        val mensaje = savedInstanceState?.getString("mensaje")
        Log.d(TAG, "El mensaje recuperdo es: $mensaje")
        return inflater.inflate(R.layout.fragment_ciclovida, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mensaje = savedInstanceState?.getString("mensaje")
        Log.d(TAG, "El mensaje recuperdo es: $mensaje")
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
    }

}
