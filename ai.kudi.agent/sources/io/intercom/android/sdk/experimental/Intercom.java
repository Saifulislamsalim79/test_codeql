package io.intercom.android.sdk.experimental;

import android.app.Application;
import android.app.TaskStackBuilder;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.LateInitializationPreparer;
import io.intercom.android.sdk.UnreadConversationCountListener;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class Intercom {
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static final Twig TWIG;
    private static Intercom instance;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Twig $r0 = LumberMill.getLogger();
        TWIG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized void boot(Application application, IntercomSettings intercomSettings) {
        synchronized (Intercom.class) {
            Intercom $r2 = instance;
            if ($r2 == null) {
                String $r3 = intercomSettings.getApiKey();
                String $r4 = intercomSettings.getAppId();
                boolean $z0 = ValidatorUtil.isValidConstructorParams(application, $r3, $r4);
                if ($z0) {
                    String $r32 = intercomSettings.getApiKey();
                    String $r42 = intercomSettings.getAppId();
                    RealIntercom $r5 = RealIntercom.create(application, $r32, $r42);
                    instance = $r5;
                    LateInitializationPreparer $r6 = LateInitializationPreparer.getInstance();
                    Injector $r7 = Injector.get();
                    $r6.handlePastLifecycleEvents(application, $r7);
                    Intercom $r22 = instance;
                    RealIntercom $r52 = (RealIntercom) $r22;
                    $r52.registerUser(intercomSettings);
                } else {
                    InvalidIntercom $r8 = new InvalidIntercom();
                    instance = $r8;
                }
            } else {
                Intercom $r23 = instance;
                boolean $z02 = $r23 instanceof RealIntercom;
                if ($z02) {
                    Intercom $r24 = instance;
                    RealIntercom $r53 = (RealIntercom) $r24;
                    $r53.registerUser(intercomSettings);
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized Intercom client() {
        Intercom r2;
        synchronized (Intercom.class) {
            boolean $z0 = isBooted();
            if (!$z0) {
                IllegalStateException $r0 = new IllegalStateException("Please call Intercom.boot() before requesting the client.");
                throw $r0;
            }
            r2 = instance;
        }
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static boolean isBooted() {
        Intercom $r0 = instance;
        return $r0 != null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized void registerForLaterBoot(Application application) {
        synchronized (Intercom.class) {
            boolean $z0 = isBooted();
            if ($z0) {
                Twig $r1 = TWIG;
                Object[] $r2 = new Object[0];
                $r1.m13065i("Intercom has already been booted", $r2);
            } else if (application == null) {
                NullPointerException $r4 = new NullPointerException("Cannot call registerForLaterBoot() with a null Application");
                throw $r4;
            } else {
                LateInitializationPreparer $r3 = LateInitializationPreparer.getInstance();
                $r3.register(application);
            }
        }
    }

    public static void setLogLevel(int i) {
        LumberMill.setLogLevel(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static void unregisterForLateBoot(Application application) {
        if (application == null) {
            NullPointerException $r2 = new NullPointerException("Cannot call unregisterForLateBoot() with a null Application");
            throw $r2;
        }
        LateInitializationPreparer $r0 = LateInitializationPreparer.getInstance();
        $r0.unregister(application);
    }

    public abstract void addUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener);

    public abstract void displayConversationsList();

    public abstract void displayHelpCenter();

    public abstract void displayMessageComposer();

    public abstract void displayMessageComposer(String str);

    public abstract void displayMessenger();

    public abstract int getUnreadConversationCount();

    public abstract void handlePushMessage();

    public abstract void handlePushMessage(TaskStackBuilder taskStackBuilder);

    public abstract void hideMessenger();

    public abstract void logEvent(String str);

    public abstract void logEvent(String str, Map map);

    public abstract void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener);

    public abstract void setBottomPadding(int i);

    public abstract void setInAppMessageVisibility(Intercom.Visibility visibility);

    public abstract void setLauncherVisibility(Intercom.Visibility visibility);

    public abstract void setUserHash(String str);

    public abstract void shutdown();

    public abstract void updateUser(UserAttributes userAttributes);
}
