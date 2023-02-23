package io.intercom.android.sdk.utilities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes3.dex */
public class LinkOpener {
    private static final Twig twig = LumberMill.getLogger();

    static Uri getTargetUriFromTrackingUrl(String str) {
        Uri parse = Uri.parse(str);
        String queryParameter = parse.isHierarchical() ? parse.getQueryParameter(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL) : str;
        if (queryParameter != null) {
            str = queryParameter;
        }
        return parseUrl(str);
    }

    public static void handleUrl(String str, Context context, Api api) {
        Uri parseUrl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isTrackingUrl(str)) {
            api.hitTrackingUrl(str);
            parseUrl = getTargetUriFromTrackingUrl(str);
        } else {
            parseUrl = parseUrl(str);
        }
        openUrl(parseUrl, context);
    }

    private static boolean isTrackingUrl(String str) {
        return str.contains("via.intercom.io");
    }

    private static Uri normalizeScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        return scheme.equals(lowerCase) ? uri : uri.buildUpon().scheme(lowerCase).build();
    }

    private static void openUrl(Uri uri, Context context) {
        Intent intent = new Intent("mailto".equals(uri.getScheme()) ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            IntentUtils.safelyOpenIntent(context, intent);
        } catch (ActivityNotFoundException unused) {
            Twig twig2 = twig;
            twig2.m13068e("No Activity found to handle the URL '" + uri.toString() + "'", new Object[0]);
        } catch (SecurityException e) {
            Twig twig3 = twig;
            twig3.m13068e("Couldn't open link because of error: " + e.getMessage(), new Object[0]);
        }
    }

    private static Uri parseUrl(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            parse = Uri.parse("http://" + str);
        }
        return (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https")) ? normalizeScheme(parse) : parse;
    }
}
