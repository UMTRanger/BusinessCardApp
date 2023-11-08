package com.example.businesscard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
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
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image,
              contentDescription = null,
              modifier = Modifier
                  .height(120.dp)
                  .width(150.dp))
        Text(text = stringResource(R.string.fullname_text), color = Color.White)
        Text(text = stringResource(R.string.title_text), color = Color(0xFF3ddc84))

    }

    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 700.dp)
            .padding(bottom = 70.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom

    ){
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),

            ){
            val icon = painterResource(R.drawable.baseline_phone_white_24dp)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84))
            Text(text = stringResource(R.string.phoneno_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon2 = painterResource(id = R.drawable.baseline_share_white_24dp)
            Icon(painter = icon2, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
            Text(text = stringResource(R.string.shareno_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon3 = painterResource(id = R.drawable.baseline_email_white_24dp)
            Icon(painter = icon3, contentDescription = null, modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
            Text(text = stringResource(R.string.mail_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}