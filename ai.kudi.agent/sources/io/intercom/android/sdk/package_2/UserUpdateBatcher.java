package io.intercom.android.sdk.package_2;

import android.os.Handler;
import android.os.Looper;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.actions.Actions;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.state.State;
import io.intercom.android.sdk.store.Store;
import java.util.UUID;
/* loaded from: classes.dex */
public class UserUpdateBatcher {
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    private UserUpdateRequest pendingUpdate;
    private String pendingUpdateIdentifier;
    private final Store<State> store;

    UserUpdateBatcher(Handler handler, Provider provider, Provider provider2, Store store) {
        this.apiProvider = provider;
        this.handler = handler;
        this.appConfigProvider = provider2;
        this.store = store;
        resetPendingUpdate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UserUpdateBatcher create(Provider provider, Provider provider2, Store store) {
        Looper $r5 = Looper.getMainLooper();
        Handler $r4 = new Handler($r5);
        UserUpdateBatcher $r3 = new UserUpdateBatcher($r4, provider, provider2, store);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private long maxDelay(UserUpdateRequest userUpdateRequest) {
        Provider $r2 = this.appConfigProvider;
        Object $r3 = $r2.get();
        AppConfig $r4 = (AppConfig) $r3;
        boolean $z0 = userUpdateRequest.isInternalUpdate();
        if ($z0) {
            long $l0 = $r4.getPingDelayMs();
            return $l0;
        }
        long $l02 = $r4.getBatchUserUpdatePeriodMs();
        return $l02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void resetPendingUpdate() {
        UserUpdateRequest $r1 = new UserUpdateRequest();
        this.pendingUpdate = $r1;
        UUID $r2 = UUID.randomUUID();
        String $r3 = $r2.toString();
        this.pendingUpdateIdentifier = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void submitPendingUpdate(UserUpdateRequest userUpdateRequest) {
        boolean $z0 = userUpdateRequest.isValidUpdate();
        if ($z0) {
            boolean $z02 = userUpdateRequest.isNewSession();
            if ($z02) {
                Store $r2 = this.store;
                Action $r3 = Actions.sessionStarted();
                $r2.dispatch($r3);
            }
            Provider $r4 = this.apiProvider;
            Object $r5 = $r4.get();
            FeedbackDialog $r6 = (FeedbackDialog) $r5;
            $r6.updateUser(userUpdateRequest);
            resetPendingUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public synchronized void submitPendingUpdate(String str) {
        String $r1 = this.pendingUpdateIdentifier;
        boolean $z0 = $r1.equals(str);
        if ($z0) {
            UserUpdateRequest $r3 = this.pendingUpdate;
            submitPendingUpdate($r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void submitPendingUpdateWithDelay(long j) {
        if (j <= 0) {
            submitPendingUpdate();
            return;
        }
        final String $r2 = this.pendingUpdateIdentifier;
        Handler $r1 = this.handler;
        $r1.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.package_2.UserUpdateBatcher.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public void run() {
                UserUpdateBatcher $r12 = UserUpdateBatcher.this;
                String $r22 = $r2;
                $r12.submitPendingUpdate($r22);
            }
        }, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public synchronized void submitPendingUpdate() {
        UserUpdateRequest $r1 = this.pendingUpdate;
        submitPendingUpdate($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: Throwable -> 0x0039, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000c, B:8:0x0014, B:13:0x0026, B:15:0x0030), top: B:21:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateUser(io.intercom.android.sdk.package_2.UserUpdateRequest r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            io.intercom.android.sdk.package_2.UserUpdateRequest r0 = r8.pendingUpdate     // Catch: java.lang.Throwable -> L39
            boolean r1 = r0.canMergeUpdate(r9)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto Lc
            r8.submitPendingUpdate()     // Catch: java.lang.Throwable -> L39
        Lc:
            io.intercom.android.sdk.package_2.UserUpdateRequest r0 = r8.pendingUpdate     // Catch: java.lang.Throwable -> L39
            boolean r1 = r0.isValidUpdate()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L25
            long r2 = r8.maxDelay(r9)     // Catch: java.lang.Throwable -> L39
            io.intercom.android.sdk.package_2.UserUpdateRequest r0 = r8.pendingUpdate     // Catch: java.lang.Throwable -> L39
            long r4 = r8.maxDelay(r0)     // Catch: java.lang.Throwable -> L39
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L25
        L23:
            r1 = 0
            goto L26
        L25:
            r1 = 1
        L26:
            io.intercom.android.sdk.package_2.UserUpdateRequest r0 = r8.pendingUpdate     // Catch: java.lang.Throwable -> L39
            io.intercom.android.sdk.package_2.UserUpdateRequest r9 = r0.merge(r9)     // Catch: java.lang.Throwable -> L39
            r8.pendingUpdate = r9     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L37
            long r2 = r8.maxDelay(r9)     // Catch: java.lang.Throwable -> L39
            r8.submitPendingUpdateWithDelay(r2)     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r8)
            return
        L39:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.package_2.UserUpdateBatcher.updateUser(io.intercom.android.sdk.package_2.UserUpdateRequest):void");
    }
}
