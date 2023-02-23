package ai.kudi.agent.biometric.security;

import android.content.Context;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
/* compiled from: IPFSecurityUtils.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/biometric/security/IPFSecurityUtils;", "", "decode", "", "alias", "encodedString", "deleteKey", "", "encode", "context", "Landroid/content/Context;", MetricTracker.Object.INPUT, "isAuthorizationRequired", "", "isKeystoreContainAlias", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface IPFSecurityUtils {
    String decode(String str, String str2) throws PFSecurityException;

    void deleteKey(String str) throws PFSecurityException;

    String encode(Context context, String str, String str2, boolean z) throws PFSecurityException;

    boolean isKeystoreContainAlias(String str) throws PFSecurityException;
}
