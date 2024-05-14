package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun PersonalInfo(name: String, occupation: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .background(color = Color(0xFF073042))
                .size(
                    width = 100.dp,
                    height = 100.dp
                )
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            fontSize = 50.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = occupation,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006A34),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)

        )
    }
}
@Composable
fun ContactInfo(mobileNumber: String,social: String,email: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_call_24),
                contentDescription = "phone Icon",
                tint = Color(0xFF006A34),
                modifier = Modifier
                    .size(24.dp)
            )
            Text(
                text = mobileNumber,
                modifier = Modifier
                    .padding(
                        start = 20.dp
                    )
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_share_24),
                contentDescription = null,
                tint = Color(0xFF006A34),
                modifier = Modifier
                    .size(24.dp)
            )
            Text(
                text = social,
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        top = 12.dp,
                        bottom = 12.dp
                    )
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_textsms_24),
                contentDescription = null,
                tint = Color(0xFF006A34)
            )
            Text(
                text = email,
                modifier = Modifier
                    .padding(
                        start = 20.dp,
                        bottom = 8.dp
                    )
            )
        }
    }
}



@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xFFD0E6D2)
    ){
        Column {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(2.5f)
                    .fillMaxSize()
            ) {
                PersonalInfo(
                    name = "Priyanshu",
                    occupation = "Learning Android Development",
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            ) {
                ContactInfo(
                    mobileNumber = "+91 9937454873",
                    social = "@AndroidDeveloper",
                    email = "priyanshusamal21@gmail.com",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        //BusinessCard()
    }
}