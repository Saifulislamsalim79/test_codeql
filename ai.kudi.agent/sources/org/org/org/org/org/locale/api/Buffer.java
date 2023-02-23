package org.org.org.org.org.locale.api;

import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Buffer {
    public static final /* synthetic */ Buffer parent;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Buffer $r0 = new Buffer();
        parent = $r0;
    }

    private Buffer() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final RenderingModeOption remove(String str) {
        Log_OC.getArray(str, "renderingModeInternal");
        int $i0 = str.hashCode();
        if ($i0 == -941784056) {
            boolean $z0 = str.equals("wireframe");
            if ($z0) {
                RenderingModeOption r2 = RenderingModeOption.WIREFRAME;
                return r2;
            }
            return null;
        } else if ($i0 == -583889951) {
            boolean $z02 = str.equals("simplified_wireframe");
            if ($z02) {
                RenderingModeOption r22 = RenderingModeOption.SIMPLIFIED_WIREFRAME;
                return r22;
            }
            return null;
        } else if ($i0 == 1297309261) {
            boolean $z03 = str.equals("icon_blueprint");
            if ($z03) {
                RenderingModeOption r23 = RenderingModeOption.ICON_BLUEPRINT;
                return r23;
            }
            return null;
        } else if ($i0 != 1965271699) {
            return null;
        } else {
            boolean $z04 = str.equals("blueprint");
            if ($z04) {
                RenderingModeOption r24 = RenderingModeOption.BLUEPRINT;
                return r24;
            }
            return null;
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
    public final RenderingMode show(String str) {
        Log_OC.getArray(str, "renderingModeInternal");
        int $i0 = str.hashCode();
        switch ($i0) {
            case -1052618729:
                boolean $z0 = str.equals("native");
                if ($z0) {
                    RenderingMode r2 = RenderingMode.NATIVE;
                    return r2;
                }
                return null;
            case -941784056:
                boolean $z02 = str.equals("wireframe");
                if (!$z02) {
                    return null;
                }
                break;
            case -583889951:
                boolean $z03 = str.equals("simplified_wireframe");
                if (!$z03) {
                    return null;
                }
                break;
            case -228167282:
                boolean $z04 = str.equals("no_rendering");
                if ($z04) {
                    RenderingMode r22 = RenderingMode.NO_RENDERING;
                    return r22;
                }
                return null;
            case 1297309261:
                boolean $z05 = str.equals("icon_blueprint");
                if (!$z05) {
                    return null;
                }
                break;
            case 1965271699:
                boolean $z06 = str.equals("blueprint");
                if (!$z06) {
                    return null;
                }
                break;
            default:
                return null;
        }
        RenderingMode r23 = RenderingMode.WIREFRAME;
        return r23;
    }
}
