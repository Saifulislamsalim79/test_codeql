package ai.kudi.agent.core.domain.converters;

import ai.kudi.agent.core.domain.data.ProductProperty;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import com.google.gson.C6784f;
import com.google.gson.p184v.C6916a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductPropertyConverter.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/domain/converters/ProductPropertyConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "toList", "", "Lai/kudi/agent/core/domain/data/ProductProperty;", TransactionBreakDownItemType.DATA, "", "toString", "productProperties", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProductPropertyConverter {
    private final C6784f gson;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductPropertyConverter() {
        C6784f $r1 = new C6784f();
        this.gson = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C6784f getGson() {
        C6784f r1 = this.gson;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List toList(String str) {
        Log_OC.getArray(str, TransactionBreakDownItemType.DATA);
        Type $r3 = new C6916a<List<? extends ProductProperty>>() { // from class: ai.kudi.agent.core.domain.converters.ProductPropertyConverter$toList$listType$1
        }.getType();
        Log_OC.loadImage($r3, "object : TypeToken<List<ProductProperty>>() {}.type");
        C6784f $r4 = this.gson;
        Object $r5 = $r4.m20759m(str, $r3);
        Log_OC.loadImage($r5, "gson.fromJson(data, listType)");
        List $r6 = (List) $r5;
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(List list) {
        Log_OC.getArray(list, "productProperties");
        C6784f $r3 = this.gson;
        String $r1 = $r3.m20751u(list);
        Log_OC.loadImage($r1, "gson.toJson(productProperties)");
        return $r1;
    }
}
