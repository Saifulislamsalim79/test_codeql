package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.databinding.MyDevicesItemBinding;
import ai.kudi.agent.settings.domain.dto.MyDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: MyDevicesAdapter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\tH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0014\u0010\u0019\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/MyDevicesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/MyDevicesViewHolder;", "()V", "items", "", "Lai/kudi/agent/settings/domain/dto/MyDevice;", "onDeleteClickListener", "Lkotlin/Function2;", "", "", "getOnDeleteClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnDeleteClickListener", "(Lkotlin/jvm/functions/Function2;)V", "deleteItem", "position", "getItemCount", "getItems", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.MyDevicesAdapter */
/* loaded from: classes.dex */
public final class MyDevicesAdapter extends RecyclerView.AbstractC1623h<MyDevicesViewHolder> {
    private final List<MyDevice> items;
    private InterfaceC11771p<? super MyDevice, ? super Integer, C13666w> onDeleteClickListener;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MyDevicesAdapter() {
        ArrayList $r1 = new ArrayList();
        this.items = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void deleteItem(int i) {
        List $r1 = this.items;
        $r1.remove(i);
        notifyItemRemoved(i);
        List $r12 = this.items;
        int $i1 = $r12.size();
        notifyItemRangeChanged(i, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getItems() {
        List r1 = this.items;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11771p getOnDeleteClickListener() {
        InterfaceC11771p r1 = this.onDeleteClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(MyDevicesViewHolder myDevicesViewHolder, int i) {
        Log_OC.getArray(myDevicesViewHolder, "holder");
        List $r4 = this.items;
        Object $r3 = $r4.get(i);
        ai.kudi.agent.settings.domain.package_4.MyDevice $r5 = (ai.kudi.agent.settings.domain.package_4.MyDevice) $r3;
        MyDevicesAdapter$onBindViewHolder$1 $r2 = new MyDevicesAdapter$onBindViewHolder$1(this, i);
        myDevicesViewHolder.setData($r5, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(MyDevicesViewHolder myDevicesViewHolder, int i) {
        MyDevicesViewHolder $r2 = myDevicesViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public MyDevicesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        MyDevicesItemBinding $r5 = MyDevicesItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context), parent, false\n            )");
        MyDevicesViewHolder $r2 = new MyDevicesViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ MyDevicesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MyDevicesViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "items");
        List $r2 = this.items;
        $r2.clear();
        List $r22 = this.items;
        $r22.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnDeleteClickListener(InterfaceC11771p interfaceC11771p) {
        this.onDeleteClickListener = interfaceC11771p;
    }
}
