package com.github.carter659.spring07;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * 
 * @author 刘冬
 *
 */
public class Order {

	public String id;

	@NotNull
	@Size(min = 10, max = 20)
	public String no;

	@NotNull
	public Date date;

	@Min(100)
	@NotNull
	public Integer quantity;

	/**
	 * 省略 get set
	 */
}
