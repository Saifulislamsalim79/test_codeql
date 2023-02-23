package ai.kudi.agent.core.internal.viewmodels;

import androidx.lifecycle.C1556g0;
import androidx.lifecycle.Extension;
import androidx.lifecycle.d0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DaggerViewModelFactory.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B2\b\u0007\u0012)\u0010\u0002\u001a%\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003j\u0002`\b¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0004H\u0016¢\u0006\u0002\u0010\rR1\u0010\u0002\u001a%\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0006¢\u0006\u0002\b\u00070\u0003j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/di/viewmodels/DaggerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lai/kudi/agent/core/di/viewmodels/ViewModelCreators;", "(Ljava/util/Map;)V", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DaggerViewModelFactory implements C1556g0.InterfaceC1559b {
    private final Map<Class<? extends d0>, InterfaceC11700a<d0>> creators;

    public DaggerViewModelFactory(Map map) {
        Log_OC.getArray(map, "creators");
        this.creators = map;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public Extension create(Class cls) {
        Map.Entry entry;
        Log_OC.getArray(cls, "modelClass");
        Map $r2 = this.creators;
        InterfaceC11700a $r4 = (InterfaceC11700a) $r2.get(cls);
        if ($r4 == null) {
            Map $r22 = this.creators;
            Set $r5 = $r22.entrySet();
            Iterator $r6 = $r5.iterator();
            while (true) {
                boolean $z0 = $r6.hasNext();
                if (!$z0) {
                    entry = null;
                    break;
                }
                Object $r7 = $r6.next();
                entry = $r7;
                Class $r9 = (Class) ((Map.Entry) $r7).getKey();
                boolean $z02 = cls.isAssignableFrom($r9);
                if ($z02) {
                    break;
                }
            }
            Map.Entry $r8 = entry;
            $r4 = $r8 == null ? null : (InterfaceC11700a) $r8.getValue();
            if ($r4 == null) {
                String $r11 = Log_OC.m10359a("unknown model class ", cls);
                IllegalArgumentException $r10 = new IllegalArgumentException($r11);
                throw $r10;
            }
        }
        try {
            Object $r3 = $r4.get();
            if ($r3 != null) {
                Extension $r12 = (Extension) $r3;
                return $r12;
            }
            NullPointerException $r13 = new NullPointerException("null cannot be cast to non-null type T of ai.kudi.agent.core.di.viewmodels.DaggerViewModelFactory.create");
            throw $r13;
        } catch (Exception $r14) {
            RuntimeException $r15 = new RuntimeException($r14);
            throw $r15;
        }
    }
}
