import com.lambda.client.plugin.api.Plugin

internal object OldElytraFlightPlugin : Plugin() {

    override fun onLoad() {
        modules.add(OldElytraFlight)
    }

    override fun onUnload() {
        modules.forEach {
            it.disable()
        }
    }
}