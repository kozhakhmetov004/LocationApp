package mykotlin.nu.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import mykotlin.nu.locationapp.ui.theme.LocationData

class LocationViewModel:ViewModel(){
    private val _location= mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData){

        _location.value=newLocation

    }

}