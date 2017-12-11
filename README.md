# enhanced-handler

Basically a normal android handler, but with the ability to cancel a postDelayed Runnable.

**Gradle**

compile 'org.neidhardt:enhanced-handler:1.0.7'

**Usage**
```kotlin
val handler = EnhancedHandler()
val scheduledTask = KillableRunnable({
		scheduleNexFadeOutIteration()
})
handler.postDelayed(scheduledTask, delay)

// to stop a scheduled task, before it is executed
handler.removeCallbacks(scheduledTask)
```
