package com.example.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import com.example.test.Model.model
import com.example.test.Service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), LifecycleObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




//        Service.etherscanServices?.getEvents("la", "50km")!!
//            .enqueue(object : Callback<model>{
//                override fun onResponse(call: Call<model>, response: Response<model>) {
//                    if (response.body() != null) {
//                        Log.e("gosogs", "success \n " +
//                                " address ${response.body()!!.location!!.address}  \n " +
//                                " lon ${response.body()!!.location!!.longitude}  \n " +
//                                " lat ${response.body()!!.location!!.latitude}" +
//                                " count ${response.body()!!.pagination!!.object_count}"
//                        )
//                    } else {
//                        Log.e("gosogs", "success   but empty")
//                    }
//                }
//
//                override fun onFailure(call: Call<model>, t: Throwable) {
//                    Log.e("gosogs", "fail  ${t.stackTrace}")
//                }
//            })



//        Service.etherscanServices?.getEvents(-118.24, 34.05, "50km")!!
//            .enqueue(object : Callback<model>{
//                override fun onResponse(call: Call<model>, response: Response<model>) {
//                    if (response.body() != null) {
//                        Log.e("gosogs", "success \n " +
//                                " address ${response.body()!!.location!!.address}  \n " +
//                                " lon ${response.body()!!.location!!.longitude}  \n " +
//                                " lat ${response.body()!!.location!!.latitude}" +
//                                " count ${response.body()!!.pagination!!.object_count}"
//                        )
//                    } else {
//                        Log.e("gosogs", "success   but empty")
//                    }
//                }
//
//                override fun onFailure(call: Call<model>, t: Throwable) {
//                    Log.e("gosogs", "fail  ${t.stackTrace}")
//                }
//            })
    }

}
