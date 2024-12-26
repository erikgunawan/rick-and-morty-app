package id.faazlab.rickandmortyapp.main.navigation

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.widget.Toast
import id.faazlab.rickandmortyapp.navigation.NavigationManager

/**
 * Created by erikgunawan on 18/12/24.
 */
class NavigationManagerImpl(
    val context: Context,
) : NavigationManager {
    override fun gotoCharacterListPage() {
        safeIntent {
            context.run {
                val intent =
                    Intent(
                        this,
                        Class.forName("${BASE_FEATURE_PACKAGE}.character.presentation.list.CharacterListActivity"),
                    )
                if (this !is Activity) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                this.startActivity(intent)
            }
        }
    }

    override fun gotoEpisodeListPage() {
        safeIntent {
            context.run {
                val intent =
                    Intent(
                        this,
                        Class.forName("${BASE_FEATURE_PACKAGE}.episode.presentation.list.EpisodeListActivity"),
                    )
                if (this !is Activity) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                this.startActivity(intent)
            }
        }
    }

    override fun gotoLocationListPage() {
        safeIntent {
            context.run {
                val intent =
                    Intent(
                        this,
                        Class.forName("${BASE_FEATURE_PACKAGE}.location.presentation.list.LocationListActivity"),
                    )
                if (this !is Activity) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                this.startActivity(intent)
            }
        }
    }

    fun <T> safeIntent(execute: () -> T) {
        try {
            execute.invoke()
        } catch (_: ClassNotFoundException) {
            Toast.makeText(context, "ClassNotFoundException", Toast.LENGTH_SHORT).show()
        } catch (_: ActivityNotFoundException) {
            Toast.makeText(context, "ActivityNotFoundException", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val BASE_FEATURE_PACKAGE = "id.faazlab.rickandmortyapp.feature"
    }
}
