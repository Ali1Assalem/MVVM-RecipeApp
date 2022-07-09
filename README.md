# MVVM-RecipeApp
Kotlin, MVVM, Navigation Component, Hilt, Jetpack Compose, Retrofit2
<br>
<img align="right" src="https://user-images.githubusercontent.com/76838562/173254331-aa79eb39-653b-4a1c-8c65-ad3b337ff368.jpg" width="500">

# Main Features
1. Kotlin
2. MVVM
3. Jetpack Compose
4. MutableState
	- Simpler than LiveData or Flow with respect to composables.
5. Hilt
6. Navigation Components
7. Retrofit2
8. Single Activity Architecture
9. App Themes
10. Custom Fonts
11. Light and Dark theme
	- Toggle between themes


# Compose features
1. Snackbars
2. Dialogs
3. Theming
4. Fonts
5. Colors
6. Animations introduction
	- creating a 'shimmering' loading animation
7. ConstraintLayout
8. Rows
9. Columns
10. Scaffold
11. AppBar
12. Circular Progress Indicator


# Why not Flow or LiveData?
1. LiveData
	- LiveData has always been a love/hate thing for me. It's great for some things but can be very annoying for others. For example you MUST have an observer for livedata to emit anything. Making it pretty useless in a repository or anywhere except viewmodel->view communication.
1. Flow
	1. Flow is great. I use flows for my use cases when building out clean architecture. You don't need an "android observer" because flow lives in the coroutine world and there's even support for operators like RxJava has.
	1. Easily converted from livedata with a single function call.
	1. Tons of other useful properties. Check out the flow [docs](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/).
1. StateFlow
	1. StateFlow is the newest addition to kotlinx.coroutines.flow. Simply put StateFlow is a flow with special properties.
	1. Originally I had planned to use StateFlow in this course but it's really just totally unnecessary. I don't want to show you an unrealistic example of how to use something so I'm sticking with the very simple [MutableState](https://developer.android.com/reference/kotlin/androidx/compose/runtime/MutableState) in viewmodels.

<br>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/76838562/178115342-0de3b46f-f818-4b6b-842a-7283881041fc.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/76838562/178115363-ff005cff-ddac-472f-9bb9-e353fec6835d.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/76838562/178115382-fdc0ff4b-b9d3-49cd-9b45-d1c10cc556ce.png" width="250"/>
</p>
<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/76838562/178115404-4c8f46a4-ada8-40a7-8978-9f836128fdf6.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/76838562/178115463-535a312f-1500-43e2-b6f6-f8af0dc4119e.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/76838562/178115481-929b2d24-bdf9-4fab-a569-082e118d990d.png" width="250"/>

</p>
<br>

### Author

@ALI
