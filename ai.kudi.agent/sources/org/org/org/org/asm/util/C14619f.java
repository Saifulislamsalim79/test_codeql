package org.org.org.org.asm.util;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckedTextView;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.VideoView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.smartlook.sdk.smartlook.C7206R;
import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import org.org.org.org.asm.C14605i;
import org.org.org.org.asm.ClassWriter;
import org.org.org.org.asm.asm.Attribute;
/* renamed from: org.org.org.org.asm.util.f */
/* loaded from: classes.dex */
public final class C14619f {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final List m1036a(View view) {
        List $r7;
        List $r72;
        List $r73;
        Drawable $r5;
        List $r74;
        List $r75;
        Drawable $r52;
        List $r76;
        List $r77;
        List $r78;
        List $r79;
        List $r710;
        List $r711;
        List $r712;
        Log_OC.getArray(view, "$this$extractDrawables");
        try {
            boolean $z0 = update(view);
            if ($z0) {
                ClassWriter $r3 = ClassWriter.f32305c;
                Object $r4 = $r3.get("mDrawable", view);
                Drawable $r53 = (Drawable) $r4;
                if ($r53 == null) {
                    $r711 = C13726r.m3891e();
                    return $r711;
                }
                org.org.org.org.asm.asm.Type r13 = new org.org.org.org.asm.asm.Type($r53, false, 2, null);
                $r712 = C13724q.m3901b(r13);
                return $r712;
            }
            boolean $z02 = view instanceof ImageView;
            if ($z02) {
                ArrayList r14 = new ArrayList();
                ImageView $r9 = (ImageView) view;
                Drawable $r54 = $r9.getBackground();
                if ($r54 != null) {
                    org.org.org.org.asm.asm.Type r132 = new org.org.org.org.asm.asm.Type($r54, false, 2, null);
                    r14.add(r132);
                }
                ImageView $r92 = (ImageView) view;
                Drawable $r55 = $r92.getDrawable();
                if ($r55 != null) {
                    org.org.org.org.asm.asm.Type r133 = new org.org.org.org.asm.asm.Type($r55, true);
                    r14.add(r133);
                }
                $r710 = C13742z.m3825B0(r14);
                return $r710;
            }
            boolean $z03 = view instanceof ActionMenuItemView;
            if ($z03) {
                ClassWriter $r32 = ClassWriter.f32305c;
                Object $r42 = $r32.get("mIcon", view);
                Drawable $r56 = (Drawable) $r42;
                if ($r56 == null) {
                    $r78 = C13726r.m3891e();
                    return $r78;
                }
                org.org.org.org.asm.asm.Type r134 = new org.org.org.org.asm.asm.Type($r56, false, 2, null);
                $r79 = C13724q.m3901b(r134);
                return $r79;
            }
            boolean $z04 = view instanceof CheckedTextView;
            try {
                if ($z04) {
                    CheckedTextView $r10 = (CheckedTextView) view;
                    Drawable[] $r11 = $r10.getCompoundDrawables();
                    Log_OC.loadImage($r11, "this.compoundDrawables");
                    int $i0 = $r11.length;
                    int i = 0;
                    while (true) {
                        if (i >= $i0) {
                            $r52 = null;
                            break;
                        }
                        $r52 = $r11[i];
                        boolean $z05 = $r52 != null;
                        if ($z05) {
                            break;
                        }
                        i++;
                    }
                    if ($r52 == null) {
                        $r76 = C13726r.m3891e();
                        return $r76;
                    }
                    org.org.org.org.asm.asm.Type r135 = new org.org.org.org.asm.asm.Type($r52, false, 2, null);
                    $r77 = C13724q.m3901b(r135);
                    return $r77;
                }
                boolean $z06 = view instanceof AppCompatTextView;
                if (!$z06) {
                    Drawable $r57 = view.getBackground();
                    if ($r57 == null) {
                        $r72 = C13726r.m3891e();
                        return $r72;
                    }
                    org.org.org.org.asm.asm.Type r136 = new org.org.org.org.asm.asm.Type($r57, false, 2, null);
                    $r73 = C13724q.m3901b(r136);
                    return $r73;
                }
                TextView $r12 = (AppCompatTextView) view;
                TextView r15 = $r12;
                Drawable[] $r112 = r15.getCompoundDrawables();
                Log_OC.loadImage($r112, "this.compoundDrawables");
                int $i02 = $r112.length;
                int $i1 = 0;
                while (true) {
                    if ($i1 >= $i02) {
                        $r5 = null;
                        break;
                    }
                    $r5 = $r112[$i1];
                    boolean $z07 = $r5 != null;
                    if ($z07) {
                        break;
                    }
                    $i1++;
                }
                if ($r5 == null) {
                    $r74 = C13726r.m3891e();
                    return $r74;
                }
                org.org.org.org.asm.asm.Type r137 = new org.org.org.org.asm.asm.Type($r5, false, 2, null);
                $r75 = C13724q.m3901b(r137);
                return $r75;
            } catch (Exception e) {
                $r7 = C13726r.m3891e();
                return $r7;
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean add(View view) {
        Log_OC.getArray(view, "$this$isChip");
        C14605i $r1 = C14605i.f32360l;
        boolean $z0 = $r1.m1089d(true);
        if ($z0) {
            boolean $z02 = view instanceof Chip;
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static final boolean m1035b(View view) {
        Log_OC.getArray(view, "$this$isTabView");
        C14605i $r1 = C14605i.f32360l;
        boolean $z0 = $r1.m1092a(true);
        if ($z0) {
            boolean $z02 = view instanceof TabLayout.C4747i;
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static final boolean m1034c(View view) {
        Log_OC.getArray(view, "$this$isVisibleToUser");
        int $i0 = view.getVisibility();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            float $f0 = view.getAlpha();
            return $f0 > 0.0f;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static final boolean m1033d(View view) {
        boolean $z0;
        Log_OC.getArray(view, "$this$isAdView");
        Class $r1 = view.getClass();
        String $r2 = $r1.getSimpleName();
        Log_OC.loadImage($r2, "this.javaClass.simpleName");
        $z0 = C13277t.m5421J($r2, "AdView", false, 2, null);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Attribute draw(View view, Rect rect) {
        Log_OC.getArray(view, "$this$getCompoundDrawableMetrics");
        Log_OC.getArray(rect, "viewRect");
        boolean $z0 = view instanceof TextView;
        if ($z0) {
            Rect $r2 = new Rect(rect);
            TextView $r3 = (TextView) view;
            int $i0 = $r3.getPaddingLeft();
            int $i1 = $r3.getPaddingTop();
            int $i2 = $r3.getPaddingRight();
            int $i3 = $r3.getPaddingBottom();
            C14621l.draw($r2, $i0, $i1, $i2, $i3);
            Drawable[] $r4 = $r3.getCompoundDrawables();
            Log_OC.loadImage($r4, "this.compoundDrawables");
            int $i02 = $r4.length;
            int $i12 = 0;
            while (true) {
                if ($i12 >= $i02) {
                    $i12 = -1;
                    break;
                }
                Drawable $r5 = $r4[$i12];
                boolean $z02 = $r5 != null;
                if ($z02) {
                    break;
                }
                $i12++;
            }
            if ($i12 == 0) {
                int $i03 = rect.left;
                int $i13 = $r3.getCompoundPaddingLeft();
                $r2.right = $i03 + $i13;
            } else if ($i12 == 1) {
                int $i04 = rect.top;
                int $i14 = $r3.getCompoundPaddingTop();
                $r2.bottom = $i04 + $i14;
            } else if ($i12 == 2) {
                int $i05 = rect.right;
                int $i15 = $r3.getCompoundPaddingRight();
                $r2.left = $i05 - $i15;
            } else if ($i12 != 3) {
                return null;
            } else {
                int $i06 = rect.bottom;
                int $i16 = $r3.getCompoundPaddingBottom();
                $r2.top = $i06 - $i16;
            }
            int $i07 = $r3.getGravity();
            Attribute $r6 = new Attribute($i07, $r2);
            return $r6;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public static final boolean m1032e(View view) {
        Log_OC.getArray(view, "$this$isFloatingActionButton");
        C14605i $r1 = C14605i.f32360l;
        boolean $z0 = $r1.m1091b(true);
        if ($z0) {
            boolean $z02 = view instanceof FloatingActionButton;
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public static final Drawable m1031f(View view) {
        Integer $r3;
        Log_OC.getArray(view, "$this$getIcon");
        try {
            Context $r2 = view.getContext();
            boolean $z0 = view instanceof Switch;
            if ($z0) {
                int $i0 = C7206R.C7207drawable.smartlook_ic_switch;
                $r3 = Integer.valueOf($i0);
            } else {
                boolean $z02 = view instanceof DatePicker;
                if ($z02) {
                    int $i02 = C7206R.C7207drawable.smartlook_ic_calendar_view;
                    $r3 = Integer.valueOf($i02);
                } else {
                    boolean $z03 = view instanceof TimePicker;
                    if ($z03) {
                        int $i03 = C7206R.C7207drawable.smartlook_ic_calendar_view;
                        $r3 = Integer.valueOf($i03);
                    } else {
                        boolean $z04 = view instanceof ProgressBar;
                        if ($z04) {
                            ProgressBar $r4 = (ProgressBar) view;
                            boolean $z05 = $r4.isIndeterminate();
                            int $i04 = $z05 ? C7206R.C7207drawable.smartlook_ic_progress_bar_indeterminate : C7206R.C7207drawable.smartlook_ic_progress_bar_determinate;
                            $r3 = Integer.valueOf($i04);
                        } else {
                            boolean $z06 = view instanceof VideoView;
                            if ($z06) {
                                int $i05 = C7206R.C7207drawable.smartlook_ic_video_view;
                                $r3 = Integer.valueOf($i05);
                            } else {
                                boolean $z07 = view instanceof TextureView;
                                if ($z07) {
                                    int $i06 = C7206R.C7207drawable.smartlook_ic_texture_view;
                                    $r3 = Integer.valueOf($i06);
                                } else {
                                    boolean $z08 = view instanceof SurfaceView;
                                    if ($z08) {
                                        int $i07 = C7206R.C7207drawable.smartlook_ic_surface_view;
                                        $r3 = Integer.valueOf($i07);
                                    } else {
                                        boolean $z09 = view instanceof CalendarView;
                                        if ($z09) {
                                            int $i08 = C7206R.C7207drawable.smartlook_ic_calendar_view;
                                            $r3 = Integer.valueOf($i08);
                                        } else {
                                            boolean $z010 = view instanceof RatingBar;
                                            if ($z010) {
                                                int $i09 = C7206R.C7207drawable.smartlook_ic_rating_bar;
                                                $r3 = Integer.valueOf($i09);
                                            } else {
                                                boolean $z011 = view instanceof ImageButton;
                                                if ($z011) {
                                                    int $i010 = C7206R.C7207drawable.smartlook_ic_image_button;
                                                    $r3 = Integer.valueOf($i010);
                                                } else {
                                                    boolean $z012 = view instanceof ImageView;
                                                    if ($z012) {
                                                        int $i011 = C7206R.C7207drawable.smartlook_ic_image_view;
                                                        $r3 = Integer.valueOf($i011);
                                                    } else {
                                                        boolean $z013 = view instanceof Button;
                                                        if ($z013) {
                                                            int $i012 = C7206R.C7207drawable.smartlook_ic_button;
                                                            $r3 = Integer.valueOf($i012);
                                                        } else {
                                                            boolean $z014 = view instanceof TextView;
                                                            if ($z014) {
                                                                int $i013 = C7206R.C7207drawable.smartlook_ic_text_view;
                                                                $r3 = Integer.valueOf($i013);
                                                            } else {
                                                                boolean $z015 = view instanceof Spinner;
                                                                if ($z015) {
                                                                    int $i014 = C7206R.C7207drawable.smartlook_ic_spinner;
                                                                    $r3 = Integer.valueOf($i014);
                                                                } else {
                                                                    boolean $z016 = view instanceof WebView;
                                                                    if ($z016) {
                                                                        int $i015 = C7206R.C7207drawable.smartlook_ic_webview;
                                                                        $r3 = Integer.valueOf($i015);
                                                                    } else {
                                                                        boolean $z017 = m1033d(view);
                                                                        if ($z017) {
                                                                            int $i016 = C7206R.C7207drawable.smartlook_ic_ad_view;
                                                                            $r3 = Integer.valueOf($i016);
                                                                        } else {
                                                                            boolean $z018 = remove(view);
                                                                            if ($z018) {
                                                                                int $i017 = C7206R.C7207drawable.smartlook_ic_map_view;
                                                                                $r3 = Integer.valueOf($i017);
                                                                            } else {
                                                                                boolean $z019 = add(view);
                                                                                if ($z019) {
                                                                                    int $i018 = C7206R.C7207drawable.smartlook_ic_chip;
                                                                                    $r3 = Integer.valueOf($i018);
                                                                                } else {
                                                                                    boolean $z020 = m1030i(view);
                                                                                    if ($z020) {
                                                                                        int $i019 = C7206R.C7207drawable.smartlook_ic_chip_group;
                                                                                        $r3 = Integer.valueOf($i019);
                                                                                    } else {
                                                                                        boolean $z021 = m1032e(view);
                                                                                        if ($z021) {
                                                                                            int $i020 = C7206R.C7207drawable.smartlook_ic_fab;
                                                                                            $r3 = Integer.valueOf($i020);
                                                                                        } else {
                                                                                            $r3 = null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ($r3 != null) {
                int $i021 = $r3.intValue();
                Drawable $r5 = C1335a.m36322f($r2, $i021);
                return $r5;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String get(View view) {
        Log_OC.getArray(view, "$this$getKind");
        boolean $z0 = view instanceof Switch;
        if ($z0) {
            return "switch";
        }
        boolean $z02 = view instanceof DatePicker;
        if ($z02) {
            return "date_picker";
        }
        boolean $z03 = view instanceof TimePicker;
        if ($z03) {
            return "time_picker";
        }
        boolean $z04 = view instanceof ProgressBar;
        if ($z04) {
            ProgressBar $r1 = (ProgressBar) view;
            boolean $z1 = $r1.isIndeterminate();
            if ($z1) {
                return "indeterminate_progress_bar";
            }
        }
        if ($z04) {
            ProgressBar $r12 = (ProgressBar) view;
            boolean $z05 = $r12.isIndeterminate();
            if (!$z05) {
                return "determinate_progress_bar";
            }
        }
        boolean $z06 = view instanceof VideoView;
        if ($z06) {
            return "video_view";
        }
        boolean $z07 = view instanceof TextureView;
        if ($z07) {
            return "texture_view";
        }
        boolean $z08 = view instanceof SurfaceView;
        if ($z08) {
            return "surface_view";
        }
        boolean $z09 = view instanceof CalendarView;
        if ($z09) {
            return "calendar_view";
        }
        boolean $z010 = view instanceof RatingBar;
        if ($z010) {
            return "rating_bar";
        }
        boolean $z011 = view instanceof ImageButton;
        if ($z011) {
            return "image_button";
        }
        boolean $z012 = view instanceof ImageView;
        if ($z012) {
            return "image_view";
        }
        boolean $z013 = view instanceof Button;
        if ($z013) {
            return "button";
        }
        boolean $z014 = view instanceof TextView;
        if ($z014) {
            return "text_view";
        }
        boolean $z015 = view instanceof Spinner;
        if ($z015) {
            return "spinner";
        }
        boolean $z016 = view instanceof WebView;
        if ($z016) {
            return "web_view";
        }
        boolean $z017 = m1033d(view);
        if ($z017) {
            return "ad_view";
        }
        boolean $z018 = remove(view);
        if ($z018) {
            return "map_view";
        }
        boolean $z019 = add(view);
        if ($z019) {
            return "chip";
        }
        boolean $z020 = m1030i(view);
        if ($z020) {
            return "chip_group";
        }
        boolean $z021 = m1032e(view);
        return $z021 ? "floating_action_button" : "other";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List get(java.util.List r9) {
        /*
            java.lang.String r0 = "$this$locationOnScreenRectangles"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r4 = r2.next()
            r6 = r4
            android.view.View r6 = (android.view.View) r6
            r5 = r6
            org.org.org.org.asm.Type r7 = org.org.org.org.asm.Type.f32312c
            android.graphics.Rect r8 = r7.get(r5)
            r1.add(r8)
            goto Le
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.util.C14619f.get(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public static final boolean m1030i(View view) {
        Log_OC.getArray(view, "$this$isChipGroup");
        C14605i $r1 = C14605i.f32360l;
        boolean $z0 = $r1.m1090c(true);
        if ($z0) {
            boolean $z02 = view instanceof ChipGroup;
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final float insert(View view) {
        Log_OC.getArray(view, "$this$translationZCompat");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 21) {
            float $f0 = view.getTranslationZ();
            return $f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final float onCreateView(View view) {
        Log_OC.getArray(view, "$this$elevationCompat");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 21) {
            float $f0 = view.getElevation();
            return $f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean remove(View view) {
        boolean $z0;
        Log_OC.getArray(view, "$this$isMapView");
        Class $r1 = view.getClass();
        String $r2 = $r1.getSimpleName();
        Log_OC.loadImage($r2, "this.javaClass.simpleName");
        $z0 = C13277t.m5421J($r2, "MapView", false, 2, null);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean set(View view) {
        Log_OC.getArray(view, "$this$isListMenuItemView");
        Class $r1 = view.getClass();
        String $r2 = $r1.getSimpleName();
        boolean $z0 = Log_OC.append($r2, "ListMenuItemView");
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String show(View view) {
        Log_OC.getArray(view, "$this$visibilityString");
        int $i0 = view.getVisibility();
        return $i0 != 0 ? $i0 != 4 ? $i0 != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean update(View view) {
        boolean $z0;
        Log_OC.getArray(view, "$this$isOverflowMenuButton");
        Class $r1 = view.getClass();
        String $r2 = $r1.getSimpleName();
        Log_OC.loadImage($r2, "this.javaClass.simpleName");
        $z0 = C13277t.m5421J($r2, "OverflowMenuButton", false, 2, null);
        return $z0;
    }
}
