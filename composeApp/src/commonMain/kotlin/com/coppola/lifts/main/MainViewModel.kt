package com.coppola.lifts.main

import androidx.lifecycle.ViewModel
import com.coppola.lifts.data.LiftsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel(
    private val repo: LiftsRepository
) : ViewModel(){

    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    init{
        _uiState.update{
            it.copy(str = repo.testing())
        }
    }
}