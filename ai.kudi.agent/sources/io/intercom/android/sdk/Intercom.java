package io.intercom.android.sdk;

import android.app.Application;
import android.app.TaskStackBuilder;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class Intercom {
    public static final Visibility GONE;
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static final Twig TWIG;
    public static final Visibility VISIBLE;
    private static Intercom instance;

    /* loaded from: classes.dex */
    public @interface LogLevel {
        public static final int ASSERT = 7;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;
    }

    /* loaded from: classes2.dex */
    public enum Visibility {
        GONE,
        VISIBLE
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Visibility $r1 = Visibility.VISIBLE;
        VISIBLE = $r1;
        Visibility $r12 = Visibility.GONE;
        GONE = $r12;
        Twig $r0 = LumberMill.getLogger();
        TWIG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized Intercom client() {
        Intercom $r0;
        synchronized (Intercom.class) {
            Intercom $r02 = instance;
            if ($r02 == null) {
                IllegalStateException $r1 = new IllegalStateException("Please call Intercom.initialize() before requesting the client.");
                throw $r1;
            }
            $r0 = instance;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized void initialize(Application application, String str, String str2) {
        synchronized (Intercom.class) {
            Intercom $r3 = instance;
            if ($r3 != null) {
                Twig $r4 = TWIG;
                Object[] $r5 = new Object[0];
                $r4.m13065i("Intercom has already been initialized", $r5);
                return;
            }
            boolean $z0 = ValidatorUtil.isValidConstructorParams(application, str, str2);
            if ($z0) {
                Twig $r42 = TWIG;
                Object[] $r52 = new Object[0];
                $r42.m13065i("Intercom has already been initialized", $r52);
                Intercom $r32 = RealIntercom.create(application, str, str2);
                instance = $r32;
                LateInitializationPreparer $r6 = LateInitializationPreparer.getInstance();
                Injector $r7 = Injector.get();
                $r6.handlePastLifecycleEvents(application, $r7);
            } else {
                Intercom r10 = new InvalidIntercom();
                Intercom $r33 = r10;
                instance = $r33;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized void registerForLaterInitialisation(Application application) {
        synchronized (Intercom.class) {
            Intercom $r2 = instance;
            if ($r2 != null) {
                Twig $r3 = TWIG;
                Object[] $r4 = new Object[0];
                $r3.m13065i("Intercom has already been initialized", $r4);
            } else if (application == null) {
                NullPointerException $r5 = new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                throw $r5;
            } else {
                LateInitializationPreparer $r0 = LateInitializationPreparer.getInstance();
                $r0.register(application);
            }
        }
    }

    public static void setLogLevel(int i) {
        LumberMill.setLogLevel(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static void unregisterForLateInitialisation(Application application) {
        if (application == null) {
            NullPointerException $r2 = new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
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

    public abstract void logout();

    public abstract void registerIdentifiedUser(Registration registration);

    public abstract void registerUnidentifiedUser();

    public abstract void removeUnreadConversationCountListener(UnreadConversationCountListener unreadConversationCountListener);

    public abstract void reset();

    public abstract void setBottomPadding(int i);

    public abstract void setInAppMessageVisibility(Visibility visibility);

    public abstract void setLauncherVisibility(Visibility visibility);

    public abstract void setUserHash(String str);

    public abstract void updateUser(UserAttributes userAttributes);
}
