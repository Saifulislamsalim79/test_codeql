package com.google.android.play.core.assetpacks;

import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.play.core.internal.C4957a;
/* loaded from: classes2.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: c */
    private final C4957a f12247c = new C4957a("AssetPackExtractionService");

    /* renamed from: d */
    Context f12248d;

    /* renamed from: e */
    C4933v2 f12249e;

    /* renamed from: f */
    C4840b0 f12250f;

    /* renamed from: w */
    private BinderC4946z f12251w;

    /* renamed from: x */
    private NotificationManager f12252x;

    /* renamed from: c */
    private final synchronized void m26173c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f12248d, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f12248d).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f12247c.m25954f("Starting foreground service.", new Object[0]);
        this.f12249e.m25990b(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12252x.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: a */
    public final synchronized Bundle m26175a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        C4957a c4957a = this.f12247c;
        Integer valueOf = Integer.valueOf(i);
        c4957a.m25957c("updateServiceState: %d", valueOf);
        if (i == 1) {
            m26173c(bundle);
        } else if (i == 2) {
            m26174b();
        } else {
            this.f12247c.m25955e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m26174b() {
        this.f12247c.m25954f("Stopping service.", new Object[0]);
        this.f12249e.m25990b(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f12251w;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f12247c.m25957c("onCreate", new Object[0]);
        C4932v1.m25999a(getApplicationContext()).mo26051a(this);
        this.f12251w = new BinderC4946z(this.f12248d, this, this.f12250f);
        this.f12252x = (NotificationManager) this.f12248d.getSystemService(IncomingMessage.TYPE_NOTIFICATION);
    }
}
