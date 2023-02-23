package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import java.util.Map;
/* loaded from: classes3.dex */
public class AttributeSanitiser {
    private static final String EMAIL = "email";
    private static final String USER_ID = "user_id";
    private static final Twig twig = LumberMill.getLogger();

    public static void anonymousSanitisation(Map<String, ?> map) {
        if (map.containsKey("email")) {
            twig.m13068e(String.format("You cannot update the email of an anonymous user. Please call registerIdentified user instead. The email: %s was NOT applied", map.remove("email")), new Object[0]);
        }
        if (map.containsKey(USER_ID)) {
            twig.m13068e(String.format("You cannot update the user_id of an anonymous user. Please call registerIdentified user instead. The user_id: %s was NOT applied", map.remove(USER_ID)), new Object[0]);
        }
    }
}
