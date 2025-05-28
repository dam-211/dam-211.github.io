package ar.edu.ifts18.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    // _contador: Quiere deciur que es MUTABLE y PRIVADA
    private val _contador = MutableLiveData(0)

    val contadorParaQueVeaElObserver: LiveData<Int> get() = _contador

    fun incrementar() {

       val actual = _contador.value?: 0
        val nuevo = actual + 1
        _contador.value = nuevo

    }
