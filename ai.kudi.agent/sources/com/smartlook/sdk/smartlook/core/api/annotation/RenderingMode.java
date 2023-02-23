package com.smartlook.sdk.smartlook.core.api.annotation;

import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.DBUtils$1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingMode;", "Ljava/lang/Enum;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "NO_RENDERING", "NATIVE", "WIREFRAME", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes.dex */
public final class RenderingMode {
    private static final /* synthetic */ RenderingMode[] $VALUES;
    public static final C7229a Companion;
    public static final RenderingMode NATIVE;
    public static final RenderingMode NO_RENDERING;
    public static final RenderingMode WIREFRAME;
    private final String code;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m10421d2 = {"com/smartlook/sdk/smartlook/core/api/annotation/RenderingMode$a", "", "code", "Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingMode;", "default", "a", "(Ljava/lang/String;Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingMode;)Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingMode;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode$a */
    /* loaded from: classes2.dex */
    public static final class C7229a {
        private C7229a() {
        }

        /* renamed from: a */
        public static /* synthetic */ RenderingMode m19095a(C7229a c7229a, String str, RenderingMode renderingMode, int i, Object obj) {
            if ((i & 2) != 0) {
                renderingMode = RenderingMode.NATIVE;
            }
            return c7229a.m19094a(str, renderingMode);
        }

        public /* synthetic */ C7229a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final RenderingMode m19094a(String str, RenderingMode renderingMode) {
            l.f(str, "code");
            l.f(renderingMode, "default");
            RenderingMode renderingMode2 = RenderingMode.NO_RENDERING;
            if (!l.b(str, renderingMode2.getCode())) {
                renderingMode2 = RenderingMode.NATIVE;
                if (!l.b(str, renderingMode2.getCode())) {
                    renderingMode2 = RenderingMode.WIREFRAME;
                    if (!l.b(str, renderingMode2.getCode())) {
                        return renderingMode;
                    }
                }
            }
            return renderingMode2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        RenderingMode $r1 = new RenderingMode("NO_RENDERING", 0, "no_rendering");
        NO_RENDERING = $r1;
        RenderingMode $r12 = new RenderingMode("NATIVE", 1, "native");
        NATIVE = $r12;
        RenderingMode $r13 = new RenderingMode("WIREFRAME", 2, "wireframe");
        WIREFRAME = $r13;
        RenderingMode[] $r0 = {$r1, $r12, $r13};
        $VALUES = $r0;
        C7229a $r2 = new C7229a((DBUtils$1) null);
        Companion = $r2;
    }

    private RenderingMode(String str, int i, String str2) {
        this.code = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final RenderingMode fromString(String str, RenderingMode renderingMode) {
        C7229a $r1 = Companion;
        RenderingMode $r0 = $r1.m19094a(str, renderingMode);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static RenderingMode valueOf(String str) {
        Enum $r0 = Enum.valueOf(RenderingMode.class, str);
        RenderingMode $r2 = (RenderingMode) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static RenderingMode[] values() {
        RenderingMode[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        RenderingMode[] $r12 = (RenderingMode[]) $r0;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCode() {
        String r1 = this.code;
        return r1;
    }
}
