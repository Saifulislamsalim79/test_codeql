package ai.kudi.agent.core.util;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: Pref.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/util/StringSharedPreferenceLiveData;", "Landroidx/lifecycle/LiveData;", "", "sharedPref", "Landroid/content/SharedPreferences;", "prefKey", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "onActive", "", "onInactive", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StringSharedPreferenceLiveData extends LiveData<String> {
    private final SharedPreferences.OnSharedPreferenceChangeListener listener;
    private final String prefKey;
    private final SharedPreferences sharedPref;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public StringSharedPreferenceLiveData(SharedPreferences sharedPreferences, String str) {
        Log_OC.getArray(sharedPreferences, "sharedPref");
        Log_OC.getArray(str, "prefKey");
        this.sharedPref = sharedPreferences;
        this.prefKey = str;
        this.listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ai.kudi.agent.core.util.PrefsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str2) {
                StringSharedPreferenceLiveData $r3 = StringSharedPreferenceLiveData.this;
                StringSharedPreferenceLiveData.m39183listener$lambda0($r3, sharedPreferences2, str2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: listener$lambda-0  reason: not valid java name */
    public static final void m39183listener$lambda0(StringSharedPreferenceLiveData stringSharedPreferenceLiveData, SharedPreferences sharedPreferences, String str) {
        String $r2;
        Log_OC.getArray(stringSharedPreferenceLiveData, "this$0");
        String $r3 = stringSharedPreferenceLiveData.prefKey;
        boolean $z0 = Log_OC.append(str, $r3);
        if ($z0) {
            if (sharedPreferences == null) {
                $r2 = null;
            } else {
                String $r22 = stringSharedPreferenceLiveData.prefKey;
                $r2 = sharedPreferences.getString($r22, "");
            }
            stringSharedPreferenceLiveData.setValue($r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        SharedPreferences $r2 = this.sharedPref;
        String $r1 = this.prefKey;
        setValue($r2.getString($r1, ""));
        SharedPreferences $r22 = this.sharedPref;
        SharedPreferences.OnSharedPreferenceChangeListener $r3 = this.listener;
        $r22.registerOnSharedPreferenceChangeListener($r3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        SharedPreferences $r1 = this.sharedPref;
        SharedPreferences.OnSharedPreferenceChangeListener $r2 = this.listener;
        $r1.unregisterOnSharedPreferenceChangeListener($r2);
    }
}
