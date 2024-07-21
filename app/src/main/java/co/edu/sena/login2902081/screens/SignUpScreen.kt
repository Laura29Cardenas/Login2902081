package co.edu.sena.login2902081.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login2902081.R
import co.edu.sena.login2902081.components.HeatingTextComponent
import co.edu.sena.login2902081.components.MyTextField
import co.edu.sena.login2902081.components.NormalTextComponent

@Composable
fun SingUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.cualquiera))
            HeatingTextComponent(value = stringResource(id = R.string.create_count))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.create_name),
                painterResource(id = R.drawable.account_circle_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.create_last_name),
                painterResource(id = R.drawable.account_circle_24px)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.create_email),
                painterResource(id = R.drawable.alternate_email_24px)
            )
        } //Column 

    }
}

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
    SingUpScreen()
}
