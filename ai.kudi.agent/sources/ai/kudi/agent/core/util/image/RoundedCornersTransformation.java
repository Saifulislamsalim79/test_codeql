package ai.kudi.agent.core.util.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.InterfaceC7330c0;
/* loaded from: classes.dex */
public class RoundedCornersTransformation implements InterfaceC7330c0 {
    private final CornerType mCornerType;
    private final int mDiameter;
    private final int mMargin;
    private final int mRadius;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ai.kudi.agent.core.util.image.RoundedCornersTransformation$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C02011 {

        /* renamed from: $SwitchMap$ai$kudi$agent$core$util$image$RoundedCornersTransformation$CornerType */
        static final /* synthetic */ int[] f222x15a3751b;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            CornerType[] $r15 = CornerType.values();
            int $i0 = $r15.length;
            int[] $r16 = new int[$i0];
            f222x15a3751b = $r16;
            try {
                CornerType $r17 = CornerType.ALL;
                int $i02 = $r17.ordinal();
                $r16[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r162 = f222x15a3751b;
                CornerType $r172 = CornerType.TOP_LEFT;
                int $i03 = $r172.ordinal();
                $r162[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r163 = f222x15a3751b;
                CornerType $r173 = CornerType.TOP_RIGHT;
                int $i04 = $r173.ordinal();
                $r163[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r164 = f222x15a3751b;
                CornerType $r174 = CornerType.BOTTOM_LEFT;
                int $i05 = $r174.ordinal();
                $r164[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r165 = f222x15a3751b;
                CornerType $r175 = CornerType.BOTTOM_RIGHT;
                int $i06 = $r175.ordinal();
                $r165[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                int[] $r166 = f222x15a3751b;
                CornerType $r176 = CornerType.TOP;
                int $i07 = $r176.ordinal();
                $r166[$i07] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                int[] $r167 = f222x15a3751b;
                CornerType $r177 = CornerType.BOTTOM;
                int $i08 = $r177.ordinal();
                $r167[$i08] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                int[] $r168 = f222x15a3751b;
                CornerType $r178 = CornerType.LEFT;
                int $i09 = $r178.ordinal();
                $r168[$i09] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                int[] $r169 = f222x15a3751b;
                CornerType $r179 = CornerType.RIGHT;
                int $i010 = $r179.ordinal();
                $r169[$i010] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                int[] $r1610 = f222x15a3751b;
                CornerType $r1710 = CornerType.OTHER_TOP_LEFT;
                int $i011 = $r1710.ordinal();
                $r1610[$i011] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                int[] $r1611 = f222x15a3751b;
                CornerType $r1711 = CornerType.OTHER_TOP_RIGHT;
                int $i012 = $r1711.ordinal();
                $r1611[$i012] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                int[] $r1612 = f222x15a3751b;
                CornerType $r1712 = CornerType.OTHER_BOTTOM_LEFT;
                int $i013 = $r1712.ordinal();
                $r1612[$i013] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                int[] $r1613 = f222x15a3751b;
                CornerType $r1713 = CornerType.OTHER_BOTTOM_RIGHT;
                int $i014 = $r1713.ordinal();
                $r1613[$i014] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                int[] $r1614 = f222x15a3751b;
                CornerType $r1714 = CornerType.DIAGONAL_FROM_TOP_LEFT;
                int $i015 = $r1714.ordinal();
                $r1614[$i015] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                int[] $r1615 = f222x15a3751b;
                CornerType $r1715 = CornerType.DIAGONAL_FROM_TOP_RIGHT;
                int $i016 = $r1715.ordinal();
                $r1615[$i016] = 15;
            } catch (NoSuchFieldError e15) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class CornerType {
        private static final /* synthetic */ CornerType[] $VALUES;
        public static final CornerType ALL;
        public static final CornerType BOTTOM;
        public static final CornerType BOTTOM_LEFT;
        public static final CornerType BOTTOM_RIGHT;
        public static final CornerType DIAGONAL_FROM_TOP_LEFT;
        public static final CornerType DIAGONAL_FROM_TOP_RIGHT;
        public static final CornerType LEFT;
        public static final CornerType OTHER_BOTTOM_LEFT;
        public static final CornerType OTHER_BOTTOM_RIGHT;
        public static final CornerType OTHER_TOP_LEFT;
        public static final CornerType OTHER_TOP_RIGHT;
        public static final CornerType RIGHT;
        public static final CornerType TOP;
        public static final CornerType TOP_LEFT;
        public static final CornerType TOP_RIGHT;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            CornerType $r1 = new CornerType("ALL", 0);
            ALL = $r1;
            CornerType $r12 = new CornerType("TOP_LEFT", 1);
            TOP_LEFT = $r12;
            CornerType $r13 = new CornerType("TOP_RIGHT", 2);
            TOP_RIGHT = $r13;
            CornerType $r14 = new CornerType("BOTTOM_LEFT", 3);
            BOTTOM_LEFT = $r14;
            CornerType $r15 = new CornerType("BOTTOM_RIGHT", 4);
            BOTTOM_RIGHT = $r15;
            CornerType $r16 = new CornerType("TOP", 5);
            TOP = $r16;
            CornerType $r17 = new CornerType("BOTTOM", 6);
            BOTTOM = $r17;
            CornerType $r18 = new CornerType("LEFT", 7);
            LEFT = $r18;
            CornerType $r19 = new CornerType("RIGHT", 8);
            RIGHT = $r19;
            CornerType $r110 = new CornerType("OTHER_TOP_LEFT", 9);
            OTHER_TOP_LEFT = $r110;
            CornerType $r111 = new CornerType("OTHER_TOP_RIGHT", 10);
            OTHER_TOP_RIGHT = $r111;
            CornerType $r112 = new CornerType("OTHER_BOTTOM_LEFT", 11);
            OTHER_BOTTOM_LEFT = $r112;
            CornerType $r113 = new CornerType("OTHER_BOTTOM_RIGHT", 12);
            OTHER_BOTTOM_RIGHT = $r113;
            CornerType $r114 = new CornerType("DIAGONAL_FROM_TOP_LEFT", 13);
            DIAGONAL_FROM_TOP_LEFT = $r114;
            CornerType $r115 = new CornerType("DIAGONAL_FROM_TOP_RIGHT", 14);
            DIAGONAL_FROM_TOP_RIGHT = $r115;
            CornerType $r0 = ALL;
            CornerType $r02 = TOP_LEFT;
            CornerType $r03 = TOP_RIGHT;
            CornerType $r04 = BOTTOM_LEFT;
            CornerType $r05 = BOTTOM_RIGHT;
            CornerType $r06 = TOP;
            CornerType $r07 = BOTTOM;
            CornerType $r08 = LEFT;
            CornerType $r09 = RIGHT;
            CornerType $r010 = OTHER_TOP_LEFT;
            CornerType $r011 = OTHER_TOP_RIGHT;
            CornerType $r012 = OTHER_BOTTOM_LEFT;
            CornerType $r013 = OTHER_BOTTOM_RIGHT;
            CornerType $r014 = DIAGONAL_FROM_TOP_LEFT;
            CornerType[] $r2 = {$r0, $r02, $r03, $r04, $r05, $r06, $r07, $r08, $r09, $r010, $r011, $r012, $r013, $r014, $r115};
            $VALUES = $r2;
        }

        private CornerType(String str, int i) {
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static CornerType valueOf(String str) {
            Enum $r0 = Enum.valueOf(CornerType.class, str);
            CornerType $r2 = (CornerType) $r0;
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
        public static CornerType[] values() {
            CornerType[] $r1 = $VALUES;
            Object $r0 = $r1.clone();
            CornerType[] $r12 = (CornerType[]) $r0;
            return $r12;
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
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RoundedCornersTransformation(int r2, int r3) {
        /*
            r1 = this;
            ai.kudi.agent.core.util.image.RoundedCornersTransformation$CornerType r0 = ai.kudi.agent.core.util.image.RoundedCornersTransformation.CornerType.ALL
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.util.image.RoundedCornersTransformation.<init>(int, int):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.mRadius = i;
        int $i1 = i * 2;
        this.mDiameter = $i1;
        this.mMargin = i2;
        this.mCornerType = cornerType;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f2 = $i0;
        int $i1 = this.mDiameter;
        float $f3 = $i1;
        float $f4 = $i0 + $i1;
        RectF $r3 = new RectF($f2, f2 - $f3, $f4, f2);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mMargin;
        float $f23 = $i03;
        float $f33 = $i03;
        float $f42 = $i03 + this.mDiameter;
        float $f5 = this.mRadius;
        RectF $r32 = new RectF($f23, $f33, $f42, f2 - $f5);
        canvas.drawRect($r32, paint);
        int $i04 = this.mMargin;
        float $f24 = this.mRadius + $i04;
        float $f34 = $i04;
        RectF $r33 = new RectF($f24, $f34, f, f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mDiameter;
        float $f2 = $i0;
        float $f3 = $i0;
        RectF $r3 = new RectF(f - $f2, f2 - $f3, f, f2);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mMargin;
        float $f23 = $i03;
        float $f33 = $i03;
        float $f4 = this.mRadius;
        RectF $r32 = new RectF($f23, $f33, f - $f4, f2);
        canvas.drawRect($r32, paint);
        int $i04 = this.mRadius;
        float $f24 = $i04;
        int $i1 = this.mMargin;
        float $f34 = $i1;
        float $f42 = $i04;
        float $f1 = f2 - $f42;
        RectF $r33 = new RectF(f - $f24, $f34, f, $f1);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawBottomRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f2 = $i0;
        int $i02 = this.mDiameter;
        float $f3 = $i02;
        RectF $r3 = new RectF($f2, f2 - $f3, f, f2);
        int $i03 = this.mRadius;
        float $f22 = $i03;
        float $f32 = $i03;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i04 = this.mMargin;
        float $f23 = $i04;
        float $f33 = $i04;
        int $i05 = this.mRadius;
        float $f4 = $i05;
        float $f1 = f2 - $f4;
        RectF $r32 = new RectF($f23, $f33, f, $f1);
        canvas.drawRect($r32, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawDiagonalFromTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i1 = this.mMargin;
        float $f2 = $i1;
        float $f3 = $i1;
        int $i0 = this.mDiameter;
        int $i2 = $i1 + $i0;
        float $f4 = $i2;
        float $f5 = $i1 + $i0;
        RectF $r3 = new RectF($f2, $f3, $f4, $f5);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mDiameter;
        float $f23 = $i03;
        float $f33 = $i03;
        RectF $r32 = new RectF(f - $f23, f2 - $f33, f, f2);
        int $i04 = this.mRadius;
        float $f24 = $i04;
        float $f34 = $i04;
        canvas.drawRoundRect($r32, $f24, $f34, paint);
        int $i12 = this.mMargin;
        float $f25 = $i12;
        int $i05 = this.mRadius;
        float $f35 = $i12 + $i05;
        float $f42 = $i05;
        RectF $r33 = new RectF($f25, $f35, f - $f42, f2);
        canvas.drawRect($r33, paint);
        int $i06 = this.mMargin;
        int $i13 = this.mRadius;
        int $i22 = $i06 + $i13;
        float $f26 = $i22;
        float $f36 = $i06;
        float $f43 = $i13;
        float $f1 = f2 - $f43;
        RectF $r34 = new RectF($f26, $f36, f, $f1);
        canvas.drawRect($r34, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawDiagonalFromTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mDiameter;
        float $f2 = $i0;
        int $i1 = this.mMargin;
        float $f3 = $i1;
        float $f4 = $i1 + $i0;
        RectF $r3 = new RectF(f - $f2, $f3, f, $f4);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mMargin;
        float $f23 = $i03;
        int $i12 = this.mDiameter;
        float $f33 = $i12;
        float $f42 = $i03 + $i12;
        RectF $r32 = new RectF($f23, f2 - $f33, $f42, f2);
        int $i04 = this.mRadius;
        float $f24 = $i04;
        float $f34 = $i04;
        canvas.drawRoundRect($r32, $f24, $f34, paint);
        int $i05 = this.mMargin;
        float $f25 = $i05;
        float $f35 = $i05;
        int $i06 = this.mRadius;
        float $f43 = $i06;
        float $f5 = $i06;
        RectF $r33 = new RectF($f25, $f35, f - $f43, f2 - $f5);
        canvas.drawRect($r33, paint);
        int $i07 = this.mMargin;
        int $i13 = this.mRadius;
        int $i2 = $i07 + $i13;
        float $f26 = $i2;
        float $f36 = $i07 + $i13;
        RectF $r34 = new RectF($f26, $f36, f, f2);
        canvas.drawRect($r34, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i1 = this.mMargin;
        float $f3 = $i1;
        float $f2 = $i1;
        float $f4 = $i1 + this.mDiameter;
        RectF $r3 = new RectF($f3, $f2, $f4, f2);
        int $i0 = this.mRadius;
        float $f22 = $i0;
        float $f32 = $i0;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i02 = this.mMargin;
        float $f23 = this.mRadius + $i02;
        float $f33 = $i02;
        RectF $r32 = new RectF($f23, $f33, f, f2);
        canvas.drawRect($r32, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawOtherBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i1 = this.mMargin;
        float $f2 = $i1;
        float $f3 = $i1;
        float $f4 = $i1 + this.mDiameter;
        RectF $r3 = new RectF($f2, $f3, f, $f4);
        int $i0 = this.mRadius;
        float $f22 = $i0;
        float $f32 = $i0;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        float $f23 = this.mDiameter;
        float $f33 = this.mMargin;
        RectF $r32 = new RectF(f - $f23, $f33, f, f2);
        int $i02 = this.mRadius;
        float $f24 = $i02;
        float $f34 = $i02;
        canvas.drawRoundRect($r32, $f24, $f34, paint);
        int $i12 = this.mMargin;
        float $f25 = $i12;
        int $i03 = this.mRadius;
        float $f35 = $i12 + $i03;
        float $f42 = $i03;
        float $f1 = f - $f42;
        RectF $r33 = new RectF($f25, $f35, $f1, f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawOtherBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f2 = $i0;
        float $f3 = $i0;
        int $i1 = this.mDiameter;
        float $f4 = $i0 + $i1;
        RectF $r3 = new RectF($f2, $f3, f, $f4);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mMargin;
        float $f23 = $i03;
        float $f33 = $i03;
        int $i12 = this.mDiameter;
        float $f42 = $i03 + $i12;
        RectF $r32 = new RectF($f23, $f33, $f42, f2);
        int $i04 = this.mRadius;
        float $f24 = $i04;
        float $f34 = $i04;
        canvas.drawRoundRect($r32, $f24, $f34, paint);
        int $i05 = this.mMargin;
        int $i13 = this.mRadius;
        int $i2 = $i05 + $i13;
        float $f25 = $i2;
        float $f35 = $i05 + $i13;
        RectF $r33 = new RectF($f25, $f35, f, f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawOtherTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f3 = $i0;
        int $i02 = this.mDiameter;
        float $f4 = $i02;
        RectF $r3 = new RectF($f3, f2 - $f4, f, f2);
        int $i03 = this.mRadius;
        float $f32 = $i03;
        float $f42 = $i03;
        canvas.drawRoundRect($r3, $f32, $f42, paint);
        int $i04 = this.mDiameter;
        float $f33 = $i04;
        int $i05 = this.mMargin;
        float $f43 = $i05;
        RectF $r32 = new RectF(f - $f33, $f43, f, f2);
        int $i06 = this.mRadius;
        float $f34 = $i06;
        float $f44 = $i06;
        canvas.drawRoundRect($r32, $f34, $f44, paint);
        int $i07 = this.mMargin;
        float $f35 = $i07;
        float $f45 = $i07;
        int $i08 = this.mRadius;
        float $f0 = $i08;
        float $f1 = f - $f0;
        float $f02 = $i08;
        float $f2 = f2 - $f02;
        RectF $r33 = new RectF($f35, $f45, $f1, $f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawOtherTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i1 = this.mMargin;
        float $f2 = $i1;
        float $f3 = $i1;
        float $f4 = $i1 + this.mDiameter;
        RectF $r3 = new RectF($f2, $f3, $f4, f2);
        int $i0 = this.mRadius;
        float $f22 = $i0;
        float $f32 = $i0;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        float $f23 = this.mMargin;
        float $f33 = this.mDiameter;
        RectF $r32 = new RectF($f23, f2 - $f33, f, f2);
        int $i02 = this.mRadius;
        float $f24 = $i02;
        float $f34 = $i02;
        canvas.drawRoundRect($r32, $f24, $f34, paint);
        int $i03 = this.mMargin;
        int $i12 = this.mRadius;
        int $i2 = $i03 + $i12;
        float $f25 = $i2;
        float $f35 = $i03;
        float $f42 = $i12;
        float $f1 = f2 - $f42;
        RectF $r33 = new RectF($f25, $f35, f, $f1);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mDiameter;
        float $f2 = $i0;
        int $i02 = this.mMargin;
        float $f3 = $i02;
        RectF $r3 = new RectF(f - $f2, $f3, f, f2);
        int $i03 = this.mRadius;
        float $f22 = $i03;
        float $f32 = $i03;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i04 = this.mMargin;
        float $f23 = $i04;
        float $f33 = $i04;
        int $i05 = this.mRadius;
        float $f4 = $i05;
        float $f1 = f - $f4;
        RectF $r32 = new RectF($f23, $f33, $f1, f2);
        canvas.drawRect($r32, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f2 = $i0;
        float $f0 = f - $f2;
        float $f22 = $i0;
        float $f1 = f2 - $f22;
        int[] $r3 = C02011.f222x15a3751b;
        CornerType $r4 = this.mCornerType;
        switch ($r3[$r4.ordinal()]) {
            case 1:
                int $i02 = this.mMargin;
                float $f23 = $i02;
                float $f3 = $i02;
                RectF $r5 = new RectF($f23, $f3, $f0, $f1);
                int $i03 = this.mRadius;
                canvas.drawRoundRect($r5, $i03, $i03, paint);
                return;
            case 2:
                drawTopLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 3:
                drawTopRightRoundRect(canvas, paint, $f0, $f1);
                return;
            case 4:
                drawBottomLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 5:
                drawBottomRightRoundRect(canvas, paint, $f0, $f1);
                return;
            case 6:
                drawTopRoundRect(canvas, paint, $f0, $f1);
                return;
            case 7:
                drawBottomRoundRect(canvas, paint, $f0, $f1);
                return;
            case 8:
                drawLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 9:
                drawRightRoundRect(canvas, paint, $f0, $f1);
                return;
            case 10:
                drawOtherTopLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 11:
                drawOtherTopRightRoundRect(canvas, paint, $f0, $f1);
                return;
            case 12:
                drawOtherBottomLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 13:
                drawOtherBottomRightRoundRect(canvas, paint, $f0, $f1);
                return;
            case 14:
                drawDiagonalFromTopLeftRoundRect(canvas, paint, $f0, $f1);
                return;
            case 15:
                drawDiagonalFromTopRightRoundRect(canvas, paint, $f0, $f1);
                return;
            default:
                int $i04 = this.mMargin;
                float $f24 = $i04;
                float $f32 = $i04;
                RectF $r52 = new RectF($f24, $f32, $f0, $f1);
                int $i05 = this.mRadius;
                canvas.drawRoundRect($r52, $i05, $i05, paint);
                return;
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
    private void drawTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mMargin;
        float $f2 = $i0;
        float $f3 = $i0;
        int $i1 = this.mDiameter;
        int $i2 = $i0 + $i1;
        float $f4 = $i2;
        float $f5 = $i0 + $i1;
        RectF $r3 = new RectF($f2, $f3, $f4, $f5);
        int $i02 = this.mRadius;
        float $f22 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i03 = this.mMargin;
        float $f23 = $i03;
        int $i12 = this.mRadius;
        int $i22 = $i03 + $i12;
        float $f33 = $i22;
        float $f42 = $i03 + $i12;
        RectF $r32 = new RectF($f23, $f33, $f42, f2);
        canvas.drawRect($r32, paint);
        int $i04 = this.mMargin;
        float $f24 = this.mRadius + $i04;
        float $f34 = $i04;
        RectF $r33 = new RectF($f24, $f34, f, f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i0 = this.mDiameter;
        float $f2 = $i0;
        float $f3 = f - $f2;
        int $i1 = this.mMargin;
        float $f22 = $i1;
        float $f4 = $i1 + $i0;
        RectF $r3 = new RectF($f3, $f22, f, $f4);
        int $i02 = this.mRadius;
        float $f23 = $i02;
        float $f32 = $i02;
        canvas.drawRoundRect($r3, $f23, $f32, paint);
        int $i03 = this.mMargin;
        float $f24 = $i03;
        float $f33 = $i03;
        float $f42 = this.mRadius;
        RectF $r32 = new RectF($f24, $f33, f - $f42, f2);
        canvas.drawRect($r32, paint);
        int $i04 = this.mRadius;
        float $f25 = $i04;
        float $f34 = this.mMargin + $i04;
        RectF $r33 = new RectF(f - $f25, $f34, f, f2);
        canvas.drawRect($r33, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void drawTopRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        int $i1 = this.mMargin;
        float $f2 = $i1;
        float $f3 = $i1;
        float $f4 = $i1 + this.mDiameter;
        RectF $r3 = new RectF($f2, $f3, f, $f4);
        int $i0 = this.mRadius;
        float $f22 = $i0;
        float $f32 = $i0;
        canvas.drawRoundRect($r3, $f22, $f32, paint);
        int $i02 = this.mMargin;
        float $f23 = $i02;
        float $f33 = $i02 + this.mRadius;
        RectF $r32 = new RectF($f23, $f33, f, f2);
        canvas.drawRect($r32, paint);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getId() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("RoundedTransformation(radius=");
        int $i0 = this.mRadius;
        $r1.append($i0);
        $r1.append(", margin=");
        int $i02 = this.mMargin;
        $r1.append($i02);
        $r1.append(", diameter=");
        int $i03 = this.mDiameter;
        $r1.append($i03);
        $r1.append(", cornerType=");
        CornerType $r2 = this.mCornerType;
        String $r3 = $r2.name();
        $r1.append($r3);
        $r1.append(")");
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // com.squareup.picasso.InterfaceC7330c0
    public Bitmap transform(Bitmap bitmap) {
        int $i0 = bitmap.getWidth();
        int $i1 = bitmap.getHeight();
        Bitmap.Config $r5 = Bitmap.Config.ARGB_8888;
        Bitmap $r6 = Bitmap.createBitmap($i0, $i1, $r5);
        Canvas $r2 = new Canvas($r6);
        Paint $r3 = new Paint();
        $r3.setAntiAlias(true);
        Shader.TileMode $r4 = Shader.TileMode.CLAMP;
        BitmapShader $r7 = new BitmapShader(bitmap, $r4, $r4);
        $r3.setShader($r7);
        float $f0 = $i0;
        float $f1 = $i1;
        drawRoundRect($r2, $r3, $f0, $f1);
        bitmap.recycle();
        return $r6;
    }
}
