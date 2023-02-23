package ai.kudi.agent.p036v2.productSearch.viewData;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.mvvm.ViewData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ProductSearchViewData.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "()V", "Error", "Loading", "ProductList", "SearchEntry", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$Loading;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$ProductList;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$Error;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$SearchEntry;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productSearch.viewData.ProductSearchViewData */
/* loaded from: classes.dex */
public abstract class ProductSearchViewData implements ViewData {

    /* compiled from: ProductSearchViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$Error;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", MetricTracker.Object.MESSAGE, "", "retry", "", "(Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getRetry", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productSearch.viewData.ProductSearchViewData$Error */
    /* loaded from: classes.dex */
    public static final class Error extends ProductSearchViewData {
        private final String message;
        private final boolean retry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, boolean z) {
            super(null);
            Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
            this.message = str;
            this.retry = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Error copy$default(Error error, String $r1, boolean $z0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = error.message;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = error.retry;
            }
            Error $r0 = error.copy($r1, $z0);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component2() {
            boolean z0 = this.retry;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Error copy(String str, boolean z) {
            Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
            Error $r0 = new Error(str, z);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Error;
            if ($z0) {
                Error $r3 = (Error) obj;
                String $r4 = this.message;
                String $r1 = $r3.message;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    boolean $z03 = this.retry;
                    boolean $z1 = $r3.retry;
                    return $z03 == $z1;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getMessage() {
            String r1 = this.message;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getRetry() {
            boolean z0 = this.retry;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String $r1 = this.message;
            int $i0 = $r1.hashCode();
            int $i02 = $i0 * 31;
            boolean $z0 = this.retry;
            int i = $z0;
            if ($z0 != 0) {
                i = 1;
            }
            int i1 = i;
            return $i02 + i1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Error(message=");
            String $r1 = this.message;
            $r2.append($r1);
            $r2.append(", retry=");
            boolean $z0 = this.retry;
            $r2.append($z0);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    /* compiled from: ProductSearchViewData.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$Loading;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", "loading", "", "(Z)V", "getLoading", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productSearch.viewData.ProductSearchViewData$Loading */
    /* loaded from: classes.dex */
    public static final class Loading extends ProductSearchViewData {
        private final boolean loading;

        public Loading(boolean z) {
            super(null);
            this.loading = z;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ Loading copy$default(Loading loading, boolean $z0, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = loading.loading;
            }
            Loading $r1 = loading.copy($z0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component1() {
            boolean z0 = this.loading;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Loading copy(boolean z) {
            Loading $r0 = new Loading(z);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof Loading;
            if ($z0) {
                Loading $r2 = (Loading) obj;
                boolean $z02 = this.loading;
                boolean $z1 = $r2.loading;
                return $z02 == $z1;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean getLoading() {
            boolean z0 = this.loading;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            boolean $z0 = this.loading;
            if ($z0) {
                return 1;
            }
            return $z0 ? 1 : 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("Loading(loading=");
            boolean $z0 = this.loading;
            $r2.append($z0);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: ProductSearchViewData.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$ProductList;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", "products", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productSearch.viewData.ProductSearchViewData$ProductList */
    /* loaded from: classes.dex */
    public static final class ProductList extends ProductSearchViewData {
        private final List<MarketplaceProductModel> products;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductList(List list) {
            super(null);
            Log_OC.getArray(list, "products");
            this.products = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ ProductList copy$default(ProductList productList, List $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = productList.products;
            }
            ProductList $r1 = productList.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List component1() {
            List r1 = this.products;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ProductList copy(List list) {
            Log_OC.getArray(list, "products");
            ProductList $r0 = new ProductList(list);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof ProductList;
            if ($z0) {
                ProductList $r2 = (ProductList) obj;
                List $r3 = this.products;
                List $r4 = $r2.products;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final List getProducts() {
            List r1 = this.products;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            List $r1 = this.products;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("ProductList(products=");
            List $r3 = this.products;
            $r2.append($r3);
            $r2.append(')');
            String $r1 = $r2.toString();
            return $r1;
        }
    }

    /* compiled from: ProductSearchViewData.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData$SearchEntry;", "Lai/kudi/agent/v2/productSearch/viewData/ProductSearchViewData;", AttributeType.TEXT, "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productSearch.viewData.ProductSearchViewData$SearchEntry */
    /* loaded from: classes.dex */
    public static final class SearchEntry extends ProductSearchViewData {
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchEntry(String str) {
            super(null);
            Log_OC.getArray(str, AttributeType.TEXT);
            this.text = str;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ SearchEntry copy$default(SearchEntry searchEntry, String $r2, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r2 = searchEntry.text;
            }
            SearchEntry $r1 = searchEntry.copy($r2);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.text;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SearchEntry copy(String str) {
            Log_OC.getArray(str, AttributeType.TEXT);
            SearchEntry $r0 = new SearchEntry(str);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof SearchEntry;
            if ($z0) {
                SearchEntry $r2 = (SearchEntry) obj;
                String $r3 = this.text;
                String $r4 = $r2.text;
                boolean $z02 = Log_OC.append($r3, $r4);
                return $z02;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getText() {
            String r1 = this.text;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.text;
            int $i0 = $r1.hashCode();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("SearchEntry(text=");
            String $r1 = this.text;
            $r2.append($r1);
            $r2.append(')');
            String $r12 = $r2.toString();
            return $r12;
        }
    }

    private ProductSearchViewData() {
    }

    public /* synthetic */ ProductSearchViewData(DBUtils$1 dBUtils$1) {
        this();
    }
}
