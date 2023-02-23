package io.intercom.android.sdk.utilities;

import android.app.Application;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes3.dex */
public class ValidatorUtil {
    private static final String API_PREFIX = "android_sdk-";
    private static final Twig twig = LumberMill.getLogger();

    static boolean apiKeyIsMissingPrefix(String str) {
        return str == null || !str.startsWith(API_PREFIX);
    }

    static boolean apiKeyIsTooShort(String str) {
        return str == null || str.length() < 52;
    }

    private static boolean appIdIsInvalid(String str) {
        return str == null || ApiFactory.removeInvalidCharacters(str).isEmpty();
    }

    public static boolean isValidConstructorParams(Application application, String str, String str2) {
        boolean z;
        if (application == null) {
            twig.m13068e("The Application passed in was null.We need an Application to enable Intercom in your app", new Object[0]);
            z = false;
        } else {
            z = true;
        }
        if (appIdIsInvalid(str2)) {
            Twig twig2 = twig;
            twig2.m13068e("The app ID (" + str2 + ") you provided is either null or empty. We need a valid app ID to enable Intercom in your app", new Object[0]);
            z = false;
        }
        if (apiKeyIsTooShort(str)) {
            Twig twig3 = twig;
            twig3.m13068e("The API key provided (" + str + ") is too short.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
            z = false;
        }
        if (apiKeyIsMissingPrefix(str)) {
            Twig twig4 = twig;
            twig4.m13068e("The API key provided (" + str + ") does not begin with 'android_sdk-'.\nPlease check that you are using an Intercom Android SDK key and have not passed the appId into the apiKey field\n", new Object[0]);
            return false;
        }
        return z;
    }
}
