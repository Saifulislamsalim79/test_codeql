package com.smartlook.sdk.smartlook.core.api.annotation;

import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p485d.DBUtils$1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingModeOption;", "Ljava/lang/Enum;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "WIREFRAME", "BLUEPRINT", "ICON_BLUEPRINT", "SIMPLIFIED_WIREFRAME", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes.dex */
public final class RenderingModeOption {
    private static final /* synthetic */ RenderingModeOption[] $VALUES;
    public static final RenderingModeOption BLUEPRINT;
    public static final C7230a Companion;
    public static final RenderingModeOption ICON_BLUEPRINT;
    public static final RenderingModeOption SIMPLIFIED_WIREFRAME;
    public static final RenderingModeOption WIREFRAME;
    private final String code;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m10421d2 = {"com/smartlook/sdk/smartlook/core/api/annotation/RenderingModeOption$a", "", "code", "Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingModeOption;", "default", "a", "(Ljava/lang/String;Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingModeOption;)Lcom/smartlook/sdk/smartlook/core/api/annotation/RenderingModeOption;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption$a */
    /* loaded from: classes2.dex */
    public static final class C7230a {
        private C7230a() {
        }

        /* renamed from: a */
        public static /* synthetic */ RenderingModeOption m19093a(C7230a c7230a, String str, RenderingModeOption renderingModeOption, int i, Object obj) {
            if ((i & 2) != 0) {
                renderingModeOption = RenderingModeOption.WIREFRAME;
            }
            return c7230a.m19092a(str, renderingModeOption);
        }

        public /* synthetic */ C7230a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final RenderingModeOption m19092a(String str, RenderingModeOption renderingModeOption) {
            l.f(str, "code");
            l.f(renderingModeOption, "default");
            RenderingModeOption renderingModeOption2 = RenderingModeOption.WIREFRAME;
            if (!l.b(str, renderingModeOption2.getCode())) {
                renderingModeOption2 = RenderingModeOption.BLUEPRINT;
                if (!l.b(str, renderingModeOption2.getCode())) {
                    renderingModeOption2 = RenderingModeOption.ICON_BLUEPRINT;
                    if (!l.b(str, renderingModeOption2.getCode())) {
                        renderingModeOption2 = RenderingModeOption.SIMPLIFIED_WIREFRAME;
                        if (!l.b(str, renderingModeOption2.getCode())) {
                            return renderingModeOption;
                        }
                    }
                }
            }
            return renderingModeOption2;
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
        RenderingModeOption $r1 = new RenderingModeOption("WIREFRAME", 0, "wireframe");
        WIREFRAME = $r1;
        RenderingModeOption $r12 = new RenderingModeOption("BLUEPRINT", 1, "blueprint");
        BLUEPRINT = $r12;
        RenderingModeOption $r13 = new RenderingModeOption("ICON_BLUEPRINT", 2, "icon_blueprint");
        ICON_BLUEPRINT = $r13;
        RenderingModeOption $r14 = new RenderingModeOption("SIMPLIFIED_WIREFRAME", 3, "simplified_wireframe");
        SIMPLIFIED_WIREFRAME = $r14;
        RenderingModeOption[] $r0 = {$r1, $r12, $r13, $r14};
        $VALUES = $r0;
        C7230a $r2 = new C7230a((DBUtils$1) null);
        Companion = $r2;
    }

    private RenderingModeOption(String str, int i, String str2) {
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
    public static final RenderingModeOption fromString(String str, RenderingModeOption renderingModeOption) {
        C7230a $r1 = Companion;
        RenderingModeOption $r0 = $r1.m19092a(str, renderingModeOption);
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
    public static RenderingModeOption valueOf(String str) {
        Enum $r0 = Enum.valueOf(RenderingModeOption.class, str);
        RenderingModeOption $r2 = (RenderingModeOption) $r0;
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
    public static RenderingModeOption[] values() {
        RenderingModeOption[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        RenderingModeOption[] $r12 = (RenderingModeOption[]) $r0;
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
