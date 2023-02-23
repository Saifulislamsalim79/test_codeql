package ai.kudi.agent.biometric.security;

import javax.crypto.CipherInputStream;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11811v;
/* compiled from: PFSecurityUtilsOld.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class PFSecurityUtilsOld$rsaDecrypt$1 extends AbstractC11802m implements InterfaceC11756a<Integer> {
    final /* synthetic */ CipherInputStream $cipherInputStream;
    final /* synthetic */ C11811v $nextByte;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PFSecurityUtilsOld$rsaDecrypt$1(C11811v c11811v, CipherInputStream cipherInputStream) {
        super(0);
        this.$nextByte = c11811v;
        this.$cipherInputStream = cipherInputStream;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final int invoke2() {
        C11811v $r1 = this.$nextByte;
        CipherInputStream $r2 = this.$cipherInputStream;
        int $i0 = $r2.read();
        $r1.f26498c = $i0;
        C11811v $r12 = this.$nextByte;
        int $i02 = $r12.f26498c;
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Integer invoke() {
        int $i0 = invoke2();
        Integer $r1 = Integer.valueOf($i0);
        return $r1;
    }
}
