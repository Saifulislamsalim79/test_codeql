package io.intercom.android.sdk.blocks;

import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class VideoProvider {
    private static final /* synthetic */ VideoProvider[] $VALUES;
    public static final VideoProvider LOOM;
    public static final VideoProvider UNKNOWN;
    public static final VideoProvider VIMEO;
    public static final VideoProvider WISTIA;
    public static final VideoProvider YOUTUBE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        VideoProvider $r1 = new VideoProvider("YOUTUBE", 0);
        YOUTUBE = $r1;
        VideoProvider $r12 = new VideoProvider("VIMEO", 1);
        VIMEO = $r12;
        VideoProvider $r13 = new VideoProvider("WISTIA", 2);
        WISTIA = $r13;
        VideoProvider $r14 = new VideoProvider("LOOM", 3);
        LOOM = $r14;
        VideoProvider $r15 = new VideoProvider("UNKNOWN", 4);
        UNKNOWN = $r15;
        VideoProvider $r0 = YOUTUBE;
        VideoProvider $r02 = VIMEO;
        VideoProvider $r03 = WISTIA;
        VideoProvider $r04 = LOOM;
        VideoProvider[] $r2 = {$r0, $r02, $r03, $r04, $r15};
        $VALUES = $r2;
    }

    private VideoProvider(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static VideoProvider valueOf(String str) {
        Enum $r0 = Enum.valueOf(VideoProvider.class, str);
        VideoProvider $r2 = (VideoProvider) $r0;
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
    public static VideoProvider[] values() {
        VideoProvider[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        VideoProvider[] $r12 = (VideoProvider[]) $r0;
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
    public static VideoProvider videoValueOf(String str) {
        VideoProvider $r3 = UNKNOWN;
        Locale $r0 = Locale.ENGLISH;
        try {
            String $r2 = str.toUpperCase($r0);
            VideoProvider $r32 = valueOf($r2);
            return $r32;
        } catch (IllegalArgumentException e) {
            return $r3;
        }
    }
}
