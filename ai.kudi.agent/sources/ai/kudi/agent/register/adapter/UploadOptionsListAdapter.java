package ai.kudi.agent.register.adapter;

import ai.kudi.agent.C0001R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: UploadOptionsListAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\nH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nH\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/register/adapter/UploadOptionsListAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "optionsListItem", "", "Lkotlin/Pair;", "", "getOptionsListItem", "()Ljava/util/List;", "getCount", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UploadOptionsListAdapter extends BaseAdapter {
    private final Context context;
    private final List<C13287o<Integer, Integer>> optionsListItem;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UploadOptionsListAdapter(Context context) {
        List $r6;
        Log_OC.getArray(context, "context");
        this.context = context;
        Integer $r3 = Integer.valueOf((int) C0001R.string.upload_photo);
        C13287o $r5 = C13664u.m4227a($r3, 17301567);
        Integer $r32 = Integer.valueOf((int) C0001R.string.take_photo);
        C13287o $r52 = C13664u.m4227a($r32, 17301559);
        C13287o[] $r2 = {$r5, $r52};
        $r6 = C13726r.m3888h($r2);
        this.optionsListItem = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public int getCount() {
        List $r1 = this.optionsListItem;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        C13287o $r1 = getItem(i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public C13287o getItem(int i) {
        List $r1 = this.optionsListItem;
        Object $r2 = $r1.get(i);
        C13287o $r3 = (C13287o) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public long getItemId(int i) {
        long $l1 = i;
        return $l1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getOptionsListItem() {
        List r1 = this.optionsListItem;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public View getView(int i, View $r1, ViewGroup viewGroup) {
        if ($r1 == null) {
            Context $r3 = this.context;
            LayoutInflater $r4 = LayoutInflater.from($r3);
            $r1 = $r4.inflate(C0001R.C0004layout.include_upload_options, viewGroup, false);
        }
        View $r5 = $r1.findViewById(C0001R.C0003id.actionTextView);
        TextView $r6 = (TextView) $r5;
        List $r7 = this.optionsListItem;
        Object $r8 = $r7.get(i);
        C13287o $r9 = (C13287o) $r8;
        Object $r82 = $r9.m5364c();
        Number $r10 = (Number) $r82;
        int $i1 = $r10.intValue();
        $r6.setText($i1);
        View $r52 = $r1.findViewById(C0001R.C0003id.actionIconImageView);
        ImageView $r11 = (ImageView) $r52;
        List $r72 = this.optionsListItem;
        Object $r83 = $r72.get(i);
        C13287o $r92 = (C13287o) $r83;
        Object $r84 = $r92.m5363d();
        Number $r102 = (Number) $r84;
        int $i0 = $r102.intValue();
        $r11.setImageResource($i0);
        Log_OC.loadImage($r1, "view");
        return $r1;
    }
}
