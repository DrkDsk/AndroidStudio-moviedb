package com.drkdsk.moviedb.core

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

object FirebaseHelper {
    fun getFirestore(): FirebaseFirestore {

        return Firebase.firestore
    }


    fun getAuthFirebase(): FirebaseAuth {
        return Firebase.auth
    }
}