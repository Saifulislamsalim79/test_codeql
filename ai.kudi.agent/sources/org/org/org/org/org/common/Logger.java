package org.org.org.org.org.common;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import java.util.HashMap;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.http.util.Label;
import org.org.org.org.android.model.Log;
import org.org.org.org.android.util.asm.Attribute;
import org.org.org.org.android.util.asm.C14539c;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.C14550x;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.android.util.asm.Plot;
import org.org.org.org.android.util.asm.Type;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.org.common.telemetry.Item;
/* loaded from: classes.dex */
public final class Logger {

    /* renamed from: a */
    public final Log f32523a;

    /* renamed from: b */
    public HashMap<String, Long> f32524b;
    public final Buffer parent;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Logger(Buffer buffer, Log log) {
        Log_OC.getArray(buffer, "sessionHandler");
        Log_OC.getArray(log, "trackingHandler");
        this.parent = buffer;
        this.f32523a = log;
        HashMap $r3 = new HashMap();
        this.f32524b = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Item get() {
        Buffer $r2 = this.parent;
        Item $r1 = Buffer.get($r2, null, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final long update(long j, String str, ViewState viewState) {
        ViewState $r1 = ViewState.START;
        if (viewState == $r1) {
            return -1L;
        }
        HashMap $r4 = this.f32524b;
        Object $r5 = $r4.get(str);
        Long $r6 = (Long) $r5;
        if ($r6 != null) {
            Log_OC.loadImage($r6, "viewStartMap[name] ?: re…ustomEvent.UNSET_DURATION");
            long $l1 = $r6.longValue();
            long $l0 = j - $l1;
            return $l0;
        }
        return -1L;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, ViewType viewType, ViewState viewState, boolean z) {
        Log_OC.getArray(str, "name");
        Log_OC.getArray(viewType, "type");
        Log_OC.getArray(viewState, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log $r4 = this.f32523a;
        EventTrackingMode $r5 = EventTrackingMode.IGNORE_NAVIGATION_INTERACTION;
        boolean $z1 = $r4.m1369d($r5);
        if (z || $z1) {
            long $l0 = System.currentTimeMillis();
            long $l1 = update($l0, str, viewState);
            ViewState $r6 = ViewState.START;
            if (viewState == $r6) {
                HashMap $r7 = this.f32524b;
                Long $r8 = Long.valueOf($l0);
                $r7.put(str, $r8);
            }
            Item $r9 = get();
            if ($r9 != null) {
                Plot $r10 = new Plot(str, viewType, viewState, $l1, $l0);
                $r9.set($r10);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(Location location) {
        Item $r4;
        Log_OC.getArray(location, "multitouch");
        Log $r3 = this.f32523a;
        EventTrackingMode $r2 = EventTrackingMode.IGNORE_USER_INTERACTION;
        boolean $z0 = $r3.m1369d($r2);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        $r4.set(location);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m939d(C14547m c14547m) {
        Item $r4;
        Log_OC.getArray(c14547m, "gesture");
        Log $r3 = this.f32523a;
        EventTrackingMode $r2 = EventTrackingMode.IGNORE_USER_INTERACTION;
        boolean $z0 = $r3.m1369d($r2);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        $r4.remove(c14547m);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m938d(EnumC14571f enumC14571f) {
        Item $r4;
        Log_OC.getArray(enumC14571f, "orientation");
        Log $r2 = this.f32523a;
        EventTrackingMode $r3 = EventTrackingMode.IGNORE_USER_INTERACTION;
        boolean $z0 = $r2.m1369d($r3);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        Type $r5 = new Type(enumC14571f, null, 2, null);
        $r4.toString($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void execute(Activity activity, ViewState viewState, boolean z) {
        Log_OC.getArray(activity, "activity");
        Log_OC.getArray(viewState, "viewState");
        org.org.org.org.asm.Type $r4 = org.org.org.org.asm.Type.f32312c;
        String $r2 = $r4.getType(activity);
        ViewType $r5 = ViewType.ACTIVITY;
        add($r2, $r5, viewState, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void get(Fragment fragment, ViewState viewState, boolean z) {
        Log_OC.getArray(fragment, "fragment");
        Log_OC.getArray(viewState, "viewState");
        org.org.org.org.asm.Type $r4 = org.org.org.org.asm.Type.f32312c;
        String $r2 = $r4.getType(fragment);
        ViewType $r5 = ViewType.FRAGMENT;
        add($r2, $r5, viewState, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void get(org.org.org.org.android.util.asm.Item item) {
        Item $r4;
        Log_OC.getArray(item, "selector");
        Log $r3 = this.f32523a;
        EventTrackingMode $r2 = EventTrackingMode.IGNORE_USER_INTERACTION;
        boolean $z0 = $r3.m1369d($r2);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        $r4.set(item);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(Label label) {
        Log_OC.getArray(label, "interceptedRequest");
        Item $r2 = get();
        if ($r2 != null) {
            $r2.set(label);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(Attribute attribute) {
        Log_OC.getArray(attribute, "connectionEvent");
        Item $r2 = get();
        if ($r2 != null) {
            $r2.set(attribute);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(Node node) {
        Item $r4;
        Log_OC.getArray(node, "rageClick");
        Log $r3 = this.f32523a;
        EventTrackingMode $r2 = EventTrackingMode.IGNORE_RAGE_CLICKS;
        boolean $z0 = $r3.m1369d($r2);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        $r4.set(node);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(C14539c c14539c) {
        Log_OC.getArray(c14539c, "crashEvent");
        Item $r2 = get();
        if ($r2 != null) {
            $r2.set(c14539c);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(C14550x c14550x) {
        Item $r4;
        Log_OC.getArray(c14550x, "keyboardEvent");
        Log $r3 = this.f32523a;
        EventTrackingMode $r2 = EventTrackingMode.IGNORE_USER_INTERACTION;
        boolean $z0 = $r3.m1369d($r2);
        if (!$z0 || ($r4 = get()) == null) {
            return;
        }
        $r4.set(c14550x);
    }
}
