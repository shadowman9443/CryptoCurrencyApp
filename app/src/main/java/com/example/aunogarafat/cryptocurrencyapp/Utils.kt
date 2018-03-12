package com.example.aunogarafat.cryptocurrencyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by aunogarafat on 3/11/18.
 * Project name CryptoCurrencyApp
 */
fun ViewGroup.inflate(layout:Int): View =LayoutInflater.from(this.context).inflate(layout,this,false)