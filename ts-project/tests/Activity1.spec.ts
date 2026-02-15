import { test } from "@playwright/test";

test("Activity 1", async ({ page }) => {
  // Go to the page
  await page.goto("https://training-support.net");

  // Get the title of the page
  let title = await page.title();
  console.log(`The title of the page is: ${title}`);

  // Click the about us button
  const button = page.getByRole("link").filter({ hasText: "About Us" });
  await button.click();

  // Wait for the About Us page to load
  await page.waitForURL("**/about/");

  // Print the title of the About Us page
  title = await page.title();
  console.log(`The title of the About Us page is: ${title}`);
  page.close()
});