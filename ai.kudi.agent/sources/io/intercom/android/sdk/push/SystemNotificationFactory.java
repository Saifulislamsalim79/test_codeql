package io.intercom.android.sdk.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.app.C1314k;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.commons.utilities.DeviceUtils;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.transforms.RoundTransform;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SystemNotificationFactory {
    private static final String CONVERSATION_URI = "conversation_id=%s";
    private static final String INTERCOM_SDK_PUSH = "intercom_sdk_push";
    private static final int LARGE_ICON_SIZE_DP = 48;
    private static final Twig twig = LumberMill.getLogger();

    private Bitmap generateAvatar(PushPayload pushPayload, Context context, AppConfig appConfig) {
        if (TextUtils.isEmpty(pushPayload.getImageUrl()) && !TextUtils.isEmpty(pushPayload.getAuthorName())) {
            return PushAvatarUtils.getNotificationInitialsBitmap(context, pushPayload.getAuthorName(), appConfig);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), PushAvatarUtils.getNotificationDefaultBitmap(context, appConfig));
        try {
            int dpToPx = ScreenUtils.dpToPx(48.0f, context);
            C10483h<Bitmap> m12984b = ComponentCallbacks2C10478c.m13018s(context.getApplicationContext()).m12984b();
            m12984b.m13004b(new C10856g().m12135k(bitmapDrawable).m12133l0(new RoundTransform()));
            m12984b.m12990q(pushPayload.getImageUrl());
            return m12984b.m12987t(dpToPx, dpToPx).get();
        } catch (Exception unused) {
            twig.m13071d("Failed to retrieve the notification image", new Object[0]);
            return bitmapDrawable.getBitmap();
        }
    }

    private String getConversationChannelId(PushPayload pushPayload) {
        return pushPayload.isFirstPart() ? "intercom_new_chats_channel" : "intercom_chat_replies_channel";
    }

    private CharSequence groupMessageBody(PushPayload pushPayload) {
        String message = pushPayload.getMessage();
        if (TextUtils.isEmpty(message)) {
            return pushPayload.getAuthorName() + ": " + pushPayload.getBody();
        }
        return message;
    }

    C1314k.C1323e baseNotificationBuilder(Context context, String str, AppConfig appConfig, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        int i = DeviceUtils.hasPermission(context, "android.permission.VIBRATE") ? 2 : 0;
        int primaryColor = appConfig.getPrimaryColor();
        C1314k.C1323e c1323e = new C1314k.C1323e(context, str);
        c1323e.m36382v(C10110R.C10111drawable.intercom_push_icon);
        c1323e.m36397g("msg");
        c1323e.m36398f(true);
        c1323e.m36395i(primaryColor);
        c1323e.m36387q(primaryColor, 500, 2000);
        c1323e.m36394j(pendingIntent);
        c1323e.m36390n(pendingIntent2);
        c1323e.m36391m(1 | i);
        return c1323e;
    }

    C1314k.C1323e createBuilder(Context context, Uri uri, String str, String str2, int i, String str3, AppConfig appConfig) {
        ComponentName componentName = new ComponentName(context, IntercomPushBroadcastReceiver.class);
        Intent component = new Intent("io.intercom.android.sdk.INTERCOM_PUSH_OPENED").setComponent(componentName);
        Intent component2 = new Intent("io.intercom.android.sdk.INTERCOM_PUSH_DISMISSED").setComponent(componentName);
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent();
            Twig twig2 = twig;
            twig2.m13068e("Couldn't get launch Intent for package '" + packageName + "' - tapping on notification will do nothing", new Object[0]);
        } else {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
            launchIntentForPackage.setData(uri);
            launchIntentForPackage.putExtra(IntercomPushManager.INTERCOM_PUSH_KEY, INTERCOM_SDK_PUSH);
            if (str != null) {
                launchIntentForPackage.putExtra(IntercomPushManager.PUSH_ONLY_CONVO_ID, str);
            }
            if (str2 != null) {
                launchIntentForPackage.putExtra(IntercomPushManager.PUSH_ONLY_INSTANCE_ID, str2);
            }
        }
        component.putExtra(IntercomPushManager.HOST_APP_INTENT, launchIntentForPackage);
        component2.putExtra(IntercomPushManager.HOST_APP_INTENT, launchIntentForPackage);
        return baseNotificationBuilder(context, str3, appConfig, PendingIntent.getBroadcast(context, i, component, 134217728), PendingIntent.getBroadcast(context, i, component2, 134217728));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Notification createGroupedNotification(List<PushPayload> list, Context context, AppConfig appConfig) {
        CharSequence format;
        Uri parse = Uri.parse("intercom_sdk/multiple_notifications");
        if (list.size() == 1) {
            format = context.getString(C10110R.string.intercom_one_new_message);
        } else {
            format = Phrase.from(context, C10110R.string.intercom_new_messages).put("n", list.size()).format();
        }
        C1314k.C1324f c1324f = new C1314k.C1324f();
        c1324f.m36376i(context.getString(C10110R.string.intercom_new_notifications));
        for (PushPayload pushPayload : list) {
            SpannableString spannableString = new SpannableString(groupMessageBody(pushPayload));
            spannableString.setSpan(new StyleSpan(1), 0, pushPayload.getAuthorName().length(), 33);
            c1324f.m36377h(spannableString);
        }
        C1314k.C1323e createBuilder = createBuilder(context, parse, null, null, -1, getConversationChannelId(list.get(list.size() - 1)), appConfig);
        createBuilder.m36392l(context.getString(C10110R.string.intercom_new_notifications));
        createBuilder.m36393k(format);
        createBuilder.m36384t(list.get(list.size() - 1).getPriority());
        createBuilder.m36380x(c1324f);
        return createBuilder.m36402b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Notification createPushOnlyNotification(PushPayload pushPayload, Context context, AppConfig appConfig) {
        String pushOnlyConversationId = pushPayload.getPushOnlyConversationId();
        String instanceId = pushPayload.getInstanceId();
        C1314k.C1323e createBuilder = createBuilder(context, Uri.parse(pushPayload.getUri()), pushOnlyConversationId, instanceId, TextUtils.isEmpty(instanceId) ? pushOnlyConversationId.hashCode() : instanceId.hashCode(), "intercom_actions_channel", appConfig);
        createBuilder.m36392l(getTitle(context, pushPayload));
        createBuilder.m36393k(pushPayload.messageOrBody());
        createBuilder.m36384t(pushPayload.getPriority());
        C1314k.C1319c c1319c = new C1314k.C1319c();
        c1319c.m36411h(pushPayload.messageOrBody());
        createBuilder.m36380x(c1319c);
        return createBuilder.m36402b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Notification createSingleNotification(PushPayload pushPayload, Context context, AppConfig appConfig) {
        C1314k.C1323e createBuilder = createBuilder(context, Uri.parse(String.format("intercom_sdk/conversation_id=%s", pushPayload.getConversationId())), null, null, -1, getConversationChannelId(pushPayload), appConfig);
        createBuilder.m36392l(getTitle(context, pushPayload));
        createBuilder.m36393k(pushPayload.getBody());
        createBuilder.m36384t(pushPayload.getPriority());
        createBuilder.m36388p(generateAvatar(pushPayload, context, appConfig));
        C1314k.C1319c c1319c = new C1314k.C1319c();
        c1319c.m36411h(pushPayload.getBody());
        createBuilder.m36380x(c1319c);
        return createBuilder.m36402b();
    }

    CharSequence getTitle(Context context, PushPayload pushPayload) {
        String title = pushPayload.getTitle();
        if (title.isEmpty()) {
            String authorName = pushPayload.getAuthorName();
            String appName = pushPayload.getAppName();
            if (authorName.isEmpty() || appName.isEmpty()) {
                return authorName.isEmpty() ? appName : authorName;
            }
            return Phrase.from(context, C10110R.string.intercom_teammate_from_company).put("name", authorName).put("company", appName).format();
        }
        return title;
    }
}
