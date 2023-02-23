package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.MyDevicesItemBinding;
import ai.kudi.agent.settings.domain.package_4.MyDevice;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MyDevicesAdapter.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/MyDevicesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/MyDevicesItemBinding;", "(Lai/kudi/agent/databinding/MyDevicesItemBinding;)V", "setData", "", "myDevicesData", "Lai/kudi/agent/settings/domain/dto/MyDevice;", "onDeleteClickListener", "Lkotlin/Function1;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.MyDevicesViewHolder */
/* loaded from: classes.dex */
public final class MyDevicesViewHolder extends RecyclerView.AbstractC1620e0 {
    private final MyDevicesItemBinding binding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MyDevicesViewHolder(ai.kudi.agent.databinding.MyDevicesItemBinding r5) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            androidx.cardview.widget.CardView r1 = r5.getRoot()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r2 = r3
            r4.<init>(r2)
            r4.binding = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.MyDevicesViewHolder.<init>(ai.kudi.agent.databinding.MyDevicesItemBinding):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setData$lambda-1  reason: not valid java name */
    public static final void m40910setData$lambda1(InterfaceC11767l interfaceC11767l, MyDevice myDevice, View view) {
        Log_OC.getArray(myDevice, "$myDevicesData");
        if (interfaceC11767l == null) {
            return;
        }
        interfaceC11767l.invoke(myDevice);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(final MyDevice myDevice, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(myDevice, "myDevicesData");
        TextView $r4 = this.binding.deviceNameView;
        CharSequence $r5 = myDevice.getName();
        TextView $r9 = $r4;
        $r9.setText($r5);
        String $r52 = myDevice.getLastLoggedInAt();
        if ($r52 != null) {
            MyDevicesItemBinding $r3 = this.binding;
            TextView $r42 = $r3.lastLoginTimeText;
            CardView $r6 = $r3.getRoot();
            Context $r7 = $r6.getContext();
            String $r53 = myDevice.getLastLoggedInAt();
            Object[] $r8 = {StringExtKt.formatIsoDate($r53)};
            CharSequence $r54 = $r7.getString(C0001R.string.last_login_template, $r8);
            TextView $r92 = $r42;
            $r92.setText($r54);
        }
        boolean $z0 = myDevice.getPrimaryDevice();
        if ($z0) {
            MyDevicesItemBinding $r32 = this.binding;
            TextView $r93 = $r32.deleteView;
            FrameLayout $r62 = $r32.getRoot();
            FrameLayout r12 = $r62;
            String $r55 = r12.getContext().getString(C0001R.string.this_device);
            $r93.setText($r55);
            MyDevicesItemBinding $r33 = this.binding;
            TextView $r94 = $r33.deleteView;
            FrameLayout $r63 = $r33.getRoot();
            FrameLayout r122 = $r63;
            Context $r72 = r122.getContext();
            Log_OC.loadImage($r72, "binding.root.context");
            int $i0 = ContextExtKt.getKudiColor($r72, C0001R.color.genderTextColor);
            $r94.setTextColor($i0);
            TextView $r95 = this.binding.deleteView;
            Log_OC.loadImage($r95, "binding.deleteView");
            ViewExtKt.setCompoundKudiDrawables$default($r95, C0001R.C0002drawable.ic_this_device_check, 0, 0, 0, 10, 14, null);
            return;
        }
        MyDevicesItemBinding $r34 = this.binding;
        TextView $r96 = $r34.deleteView;
        FrameLayout $r64 = $r34.getRoot();
        FrameLayout r123 = $r64;
        String $r56 = r123.getContext().getString(C0001R.string.delete);
        $r96.setText($r56);
        MyDevicesItemBinding $r35 = this.binding;
        TextView $r97 = $r35.deleteView;
        FrameLayout $r65 = $r35.getRoot();
        FrameLayout r124 = $r65;
        Context $r73 = r124.getContext();
        Log_OC.loadImage($r73, "binding.root.context");
        int $i02 = ContextExtKt.getKudiColor($r73, C0001R.color.redTextColor);
        $r97.setTextColor($i02);
        TextView $r98 = this.binding.deleteView;
        Log_OC.loadImage($r98, "binding.deleteView");
        ViewExtKt.setCompoundKudiDrawables$default($r98, C0001R.C0002drawable.ic_bin, 0, 0, 0, 10, 14, null);
        TextView $r99 = this.binding.deleteView;
        $r99.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.adapters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11767l $r2 = InterfaceC11767l.this;
                MyDevice $r36 = myDevice;
                MyDevicesViewHolder.m40910setData$lambda1($r2, $r36, view);
            }
        });
    }
}
