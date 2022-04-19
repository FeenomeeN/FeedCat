package com.example.feedthecat.screen.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.example.feedthecat.R
import com.example.feedthecat.screen.MainActivity

class CatWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        appWidgetIds.forEach { appWidgetId ->
            val pendingIntent = PendingIntent.getActivity(
                context,
                0,
                Intent(context, MainActivity::class.java),
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            val views = RemoteViews(
                context.packageName,
                R.layout.cat_widget_layout
            ).apply {
                setOnClickPendingIntent(R.id.widget_root, pendingIntent)
                setTextViewText(R.id.text, "Cat is satisfied")
            }

            appWidgetManager.updateAppWidget(appWidgetId, views)
        }


        super.onUpdate(context, appWidgetManager, appWidgetIds)
    }

}