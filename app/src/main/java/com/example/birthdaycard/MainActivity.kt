package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.TextFieldColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //GreetingText(message="Happy Birthday Shri",from="Sathish" )
                    GreetingImage(getString(R.string.happy_birthday_shri),getString(R.string.from_sathish))
                }
            }
        }
    }
}
@Composable
fun GreetingText(modifier: Modifier=Modifier,message:String,from:String){
    Column(
        modifier=modifier.padding(30.dp),
    verticalArrangement = Arrangement.Center) {
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 116.sp,
                    textAlign = TextAlign.Center,
            color= Black
        )
        Text(
            text = from,
            fontSize = 20.sp,
            lineHeight = 116.sp,
            modifier= modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
                    color= Black,
        textAlign=TextAlign.End
        )
    }

}
@Composable
fun GreetingImage(message:String,from:String,modifier:Modifier=Modifier)
{
    val image= painterResource(id = R.drawable.androidparty)
    Box{
        Image(painter=image,
        contentDescription = null,//to skip the Talk Back
        contentScale= ContentScale.Crop,
        alpha=1.5F
    )
        GreetingText(
            message = message,
            from = from,
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp).align(alignment = Alignment.Center )

        )

}
}
/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row {
        Text(
            text = name,
            fontSize = 40.sp,
            lineHeight = 20.sp,
            modifier = modifier
        )
        Text(
            text=name,
            fontSize = 40.sp,
            lineHeight = 20.sp,
            modifier = modifier

        )
    }

}*/

@Preview(showBackground = true,
    name="sathish"

)
@Composable
fun GreetingPreview() {
    BirthdayCardTheme {
      GreetingImage(
          stringResource(R.string.happy_birthday_shri),
          stringResource(R.string.from_sathish))


    }
}