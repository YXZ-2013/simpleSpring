package com.yin.practice.simplespring.core;

/**
 * �ýӿ��ṩ��һϵ�����Բ����ķ���,��������ֵ����������Ķ���
 *
 */
public interface AttributeAccessor {
	
	void setAttribute(String name, Object value);
	
	Object getAttribute(String name);
	
	Object removeAttribute(String name);
	
	boolean hasAttribute(String name);
	
	String[] attributeNames();
}