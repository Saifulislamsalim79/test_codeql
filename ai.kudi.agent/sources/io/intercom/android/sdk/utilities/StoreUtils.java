package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.store.Store;
/* loaded from: classes3.dex */
public class StoreUtils {
    public static void safeUnsubscribe(Store.Subscription subscription) {
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }
}
