package org.redhat.api.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("item")
@Produces(MediaType.APPLICATION_JSON)
public class ItemController {
	

	@GET
	public List<ItemModel> getAllItems() {
		
		List<ItemModel> items = new ArrayList<ItemModel>();
		
		ItemModel stub = new ItemModel(99, "1992", "mercedes", "e200");
		items.add(stub);
		
		return items;
	}
	
	@GET
	@Path("/{id}")
	public ItemModel getItem(@PathParam("id") String id) {
		
		ItemModel stub = new ItemModel(Long.valueOf(id), "1988", "bmw", "e200");
		
		return stub;
	}

	@POST
	public ItemModel createItem(ItemModel item) {
		
		ItemModel stub = item;
		stub.setId(99);
		
		return item;
	}
	
	@PUT
	public ItemModel updateItem(ItemModel item) {
		
		item.setMake("bmw");
		return item;
	}
	
	@DELETE
	@Path("/{id}")
	public HashMap<String,Boolean> deleteItem(@PathParam("id") String id) {
		
		HashMap<String,Boolean> status = new HashMap<String,Boolean>();
		status.put("isDeleted", true);

		return status;
	}

}
