package main.cosas;

import java.util.List;

public class Cosas {
	
	private class FragmentProductDetail {};
	private class FragmentHelper{
		public Object getInstance(Object obj) {
			return null;
		}
	};
	private class FragmentAction{};
	
	private int getActivity() {return 1;}
	

	private Object cosas() {

		/*
		if (lookBooks.size() < mPosition) return null; 
		Object looks = lookBooks.get(mPosition);
		
		List<Object> products = looks.products;
		if (products.size() < indexImage) return null;
		Object image = looks.products.get(indexImage);
		
		Object product = image.product;
		
		List<Object> summaries = product.getBundleProductSummaries();
		if (summaries.size() < position) return null;
		
		Object details = summaries.get(position);
		
		Object objDetail = details.getDetail();
		
		List<Object> colors = objDetail.getColors(); 
		
		if (colors == null || colors.size() <= 0) {
			return null;
		}
		
		FragmentProductDetail fragmentProductDetail = new FragmentProductDetail().newInstance(summaries, 
				position, 
				idCategory, 
				0, 
				category.getName(), 
				FragmentProductDetail.fromLookbook, 
				animate.getX(), 
				animate.getY() + lVProducts.getY() - actionBarheight, 
				animate.getMeasuredWidth(), 
				animate.getMeasuredHeight()
			);
		
		Object helper = FragmentHelper.getInstance(getActivity());
		helper.changeFragment(fragmentProductDetail, FragmentAction.ADD, true, "FragmentProductDetail", "");   


		//*/

		return null;
	}

	public static void main(String[] args) {


	}

}
